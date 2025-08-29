package com.deepti.echo01;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ClientMain {
    private static final int PORT = 8010;

    public static void main(String[] args) {
        String message = (args.length > 0) ? String.join(" ", args) : "Hello from the single-thread client";
        try (Socket socket = new Socket(InetAddress.getByName("localhost"), PORT);
             PrintWriter out = new PrintWriter(
                 new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true
             );
             BufferedReader in = new BufferedReader(
                 new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8)
             )) {

            out.println(message);                      // send one line
            String response = in.readLine();           // read one line back
            System.out.println("[01] Server replied: " + response);
        } catch (IOException e) {
            System.err.println("[01] Client error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
