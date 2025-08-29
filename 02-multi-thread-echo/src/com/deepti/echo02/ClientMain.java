package com.deepti.echo02;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class MultiClientMain {
    private static final int PORT = 8010;

    public static void main(String[] args) {
        int clients = (args.length > 0) ? Integer.parseInt(args[0]) : 10;

        for (int i = 1; i <= clients; i++) {
            final int id = i;
            Thread t = new Thread(() -> runOneClient(id), "client-" + id);
            t.start();
        }
    }

    private static void runOneClient(int id) {
        try (Socket socket = new Socket(InetAddress.getByName("localhost"), PORT);
             PrintWriter out = new PrintWriter(
                 new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true
             );
             BufferedReader in = new BufferedReader(
                 new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8)
             )) {

            out.println("Hello from client " + id);
            String reply = in.readLine();
            System.out.println("[02] Client " + id + " got: " + reply);
        } catch (IOException e) {
            System.err.println("[02] Client " + id + " error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
