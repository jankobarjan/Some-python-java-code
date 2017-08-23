package me.kobarjan.chat.main;

import me.kobarjan.chat.window.Frame;
import me.kobarjan.chat.window.Gui;

import java.awt.EventQueue;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Gui gui = new Gui(6066, "localhost", 1280, 720);
            Frame frame = new Frame(gui.bConnect(), gui.bSettings(), gui.lConnected());
            frame.setVisible(true);
        });
    }
}
