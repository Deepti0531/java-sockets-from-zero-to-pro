package com.deepti.echo01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ServerMain {
    private static final int PORT = 8010;

    public static void main(String[] args) {
        System.out.println("[01] Single-thread echo server starting on port " + PORT);
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            while (true) {
                System.out.println("[01] Waiting for a client...");
                try (Socket client = serverSocket.accept();
                     BufferedReader in = new BufferedReader(
                         new InputStreamReader(client.getInputStream(), StandardCharsets.UTF_8)
                     );
                     PrintWriter out = new PrintWriter(
                         new OutputStreamWriter(client.getOutputStream(), StandardCharsets.UTF_8), true // autoFlush
                     )) {

                    System.out.println("[01] Connected: " + client.getRemoteSocketAddress());
                    String line = in.readLine(); 
                    if (line == null) {
                        System.out.println("[01] Client closed connection without sending data.");
                    } else {
                        System.out.println("[01] Received: " + line);
                        out.println("Echo: " + line); 
                    }
                } catch (IOException e) {
                    System.err.println("[01] Error handling client: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            System.err.println("[01] Server failed to start: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
