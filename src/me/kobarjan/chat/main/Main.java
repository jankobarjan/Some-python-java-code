package me.kobarjan.chat.main;

import me.kobarjan.chat.window.Frame;
import java.awt.EventQueue;

import static me.kobarjan.chat.window.Gui.*;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Frame frame = new Frame(bConnect());
            frame.setVisible(true);
        });
    }
}
