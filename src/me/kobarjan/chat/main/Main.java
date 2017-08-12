package me.kobarjan.chat.main;

import me.kobarjan.chat.window.Frame;
import me.kobarjan.chat.window.Gui;

import java.awt.EventQueue;

import static me.kobarjan.chat.window.Gui.*;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Gui gui = new Gui(6066, "localhost");
            Frame frame = new Frame(gui.bConnect(),gui.bStartCPU(), gui.bSettings(), gui.bExit());
            frame.setVisible(true);
        });
    }
}
