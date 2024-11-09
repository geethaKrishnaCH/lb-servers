package me.easylearnz;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Server1 {
    public static void main(String[] args) throws IOException {
        // Initialize server 1
        HttpServer server1 = HttpServer.create(new InetSocketAddress(8081), 0);
        server1.createContext("/", exchange -> {
            String response = "Response from Server 1 on port 8081";
            exchange.sendResponseHeaders(200, response.length());
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response.getBytes());
            }
            exchange.close();
        });

        // Start all servers
        server1.start();
        System.out.println("Server 1 started on port 8081");
    }
}
