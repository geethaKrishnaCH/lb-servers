package me.easylearnz;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;

public class Server2 {
    public static void main(String[] args) throws IOException {
        // Initialize server 2
        HttpServer server2 = HttpServer.create(new InetSocketAddress(8082), 0);
        server2.createContext("/", exchange -> {
            String response = "Response from Server 2 on port 8082";
            exchange.sendResponseHeaders(200, response.length());
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response.getBytes());
            }
            exchange.close();
        });

        server2.start();
        System.out.println("Server 2 started on port 8082");
    }
}
