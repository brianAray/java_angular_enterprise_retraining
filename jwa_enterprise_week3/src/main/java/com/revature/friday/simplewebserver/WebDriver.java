package com.revature.friday.simplewebserver;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class WebDriver {
    public static void main(String[] args) throws IOException {
        int port = 9000;
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);

        server.createContext("/", new RootHandler());
        server.createContext("/headerData", new HeaderHandler());
        server.createContext("/getData", new GetRequestHandler());
        server.createContext("/postData", new PostRequestHandler());

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        server.setExecutor(executorService);

        server.start();
    }
}
