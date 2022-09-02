package com.revature.friday.basicwebserver;

import com.sun.net.httpserver.*;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;

public class AccessingRequests {

    public static void main(String[] args) throws IOException{
        HttpServer server = HttpServer.create(new InetSocketAddress(8500), 0);
        server.createContext("/example", AccessingRequests::handleRequest);
        server.start();
    }

    private static void handleRequest(HttpExchange exchange) throws IOException{
        URI requestUri = exchange.getRequestURI();
        printRequestInfo(exchange);
        String response = "This is the response at " + requestUri;
        exchange.sendResponseHeaders(200, response.getBytes().length);
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }

    private static void printRequestInfo(HttpExchange exchange){
        System.out.println("-- Headers --");
        Headers headers = exchange.getRequestHeaders();
        headers.entrySet().forEach(System.out::println);

        System.out.println("-- principle --");
        HttpPrincipal principal = exchange.getPrincipal();
        System.out.println(principal);

        System.out.println("-- HTTP method --");
        String requestMethod = exchange.getRequestMethod();
        System.out.println(requestMethod);

        System.out.println("-- query --");
        URI requestURI = exchange.getRequestURI();
        String query = requestURI.getQuery();
        System.out.println(query);
    }
}
