package me.kobarjan.chat.conection;

import java.io.*;
import java.net.*;

public class SocketSetup {
    public static boolean socketSetup(String serverIP, int port) {
        try {
            Socket socket = new Socket(serverIP, port);
            System.out.println("Connecting to: " + serverIP + ". On port: " + port + ".");
            System.out.println("Connected to: " + socket.getRemoteSocketAddress());
            OutputStream outputStream = socket.getOutputStream();
            DataOutputStream out = new DataOutputStream(outputStream);
            InputStream inputStream = socket.getInputStream();
            DataInputStream in = new DataInputStream(inputStream);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
