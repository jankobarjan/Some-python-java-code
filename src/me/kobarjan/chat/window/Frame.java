package me.kobarjan.chat.window;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Frame extends JFrame {

    public Frame(JButton button) {

        initUI();
        layoutInit(button);
    }

    public void initUI() {
        setTitle("Window");
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void layoutInit(JButton button){
        setLayout(null);
        add(button);
    }
}
