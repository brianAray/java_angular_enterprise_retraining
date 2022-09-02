package com.revature.friday.basicwebserver;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class BasicHttpServerExample{

    /*
    The package com.sun.net.httpserver provides Http server API, which can be used to build embedded HTTP servers.
    To get started with this API, we need to get familiar with the following classes:
     */
    public static void main(String[] args) throws IOException {

        /*
        HttpServer
        This class implements a simple HTTP server. It has factory methods create() to create its instance.
        We need to bind the server to an IP address and port number while initializing.

        Back Logging
        When a server accepts a client request, this request first will be queued by the operating system.
        Later, it will be given to the server to process the request.
        All of these simultaneous requests will be queued by the operating system.
        However, the operating system will decide how many of these requests can be queued at any given
        point in time. This value represents back logging. In our example, this value is 0, which means
        that we do not queue any requests.
         */

        HttpServer server = HttpServer.create(new InetSocketAddress(8500), 0);

        /*
        HttpContext
        It represents a mapping between the root URI path to a HttpHandler.
         */

        server.createContext("/", BasicHttpServerExample::handleRequest);

        ThreadPoolExecutor tpe = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);

        server.setExecutor(tpe);

        server.start();

    }

    /*
    HttpHandler
    It is an interface, which needs to be implemented by the application to handle the Http requests.
    It has only one method:

    void handle(HttpExchange exchange) throws IOException
     */

    private static void handleRequest(HttpExchange exchange) throws IOException{

        /*
        HttpExchange
        An instance of this class is passed to HttpHandler#handle().
        It has methods to access Http request information, and to prepare and send the response.
         */

        String response = "Hello there!";

        // Response code and length
        exchange.sendResponseHeaders(200, response.getBytes().length);

        OutputStream os = exchange.getResponseBody();

        os.write(response.getBytes());

        os.close();


    }
}
