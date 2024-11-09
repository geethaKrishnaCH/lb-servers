package me.easylearnz;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;

public class Server3 {
    public static void main(String[] args) throws IOException {
        // Initialize server 3
        HttpServer server3 = HttpServer.create(new InetSocketAddress(8083), 0);
        server3.createContext("/", exchange -> {
            String response = "Response from Server 3 on port 8083";
            exchange.sendResponseHeaders(200, response.length());
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response.getBytes());
            }
            exchange.close();
        });

        server3.start();
        System.out.println("Server 3 started on port 8083");
    }
}
