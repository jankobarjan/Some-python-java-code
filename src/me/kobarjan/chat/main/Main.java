package me.kobarjan.chat.main;

import me.kobarjan.chat.window.Frame;

import java.awt.EventQueue;

import static me.kobarjan.chat.conection.SocketSetup.socketSetup;
import static me.kobarjan.chat.window.Gui.przycisk;

public class Main {
    public static void main(String[] args) {
        int port =  6066;
        String serverIP = "";
        //socketSetup(serverIP, port);
        EventQueue.invokeLater(() -> {
            Frame frame = new Frame(przycisk());
            frame.setVisible(true);
        });
    }
}
