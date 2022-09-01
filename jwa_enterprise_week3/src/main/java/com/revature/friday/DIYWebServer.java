package com.revature.friday;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import org.apache.commons.text.StringEscapeUtils;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;


public class DIYWebServer {


    public static void main(String[] args) {
        try {
            DIYWebServer.startServer();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void startServer() throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

        server.createContext("/hello", new HelloWorldHandler());

        Executor executor = Executors.newFixedThreadPool(4);

        server.setExecutor(executor);

        server.start();
    }

    private static class HelloWorldHandler implements HttpHandler {

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            // Capture the query from the client (this is what you see in the address bar of the browser
            String query = exchange.getRequestURI().getQuery();

            // Split the query up, and deduce the exact work that the user is looking for

            OutputStream outputStream = exchange.getResponseBody();
            StringBuilder htmlBuilder = new StringBuilder();

            htmlBuilder.append(("<html>"))
                    .append("<body>")
                    .append("<h1>")
                    .append("Hello World")
                    .append("</h1>")
                    .append("</body>")
                    .append("</html>");

            // encode html content using apache commons dependency
            String htmlResponse = StringEscapeUtils.escapeHtml4(htmlBuilder.toString());

            // This line is a must
            exchange.sendResponseHeaders(200, htmlResponse.length());
            outputStream.write(htmlResponse.getBytes());
            outputStream.flush();
            outputStream.close();
        }
    }
}
