package me.kobarjan.chat.window;

import javax.swing.*;

public class Frame extends JFrame {

    public Frame() {

        initUI();
    }

    public void initUI() {
        setTitle("Window");
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
