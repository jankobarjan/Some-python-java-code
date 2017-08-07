package me.kobarjan.chat.window;

import javax.swing.*;

import static me.kobarjan.chat.window.Gui.buttons;

public class Frame extends JFrame {

    public Frame() {

        initUI();
        buttons();
    }

    public void initUI() {
        setTitle("Window");
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
