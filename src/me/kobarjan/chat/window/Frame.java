package me.kobarjan.chat.window;

import javax.swing.*;

public class Frame extends JFrame {

    public Frame(JButton bConnect, JButton bSettings, JLabel lConnected) {

        initUI();
        layoutInit(bConnect, bSettings, lConnected);
    }

    public void initUI() {
        setTitle("Window");
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
    }
    public void layoutInit(JButton button, JButton bSettings, JLabel lConnected){
        setLayout(null);
        add(button);
        add(bSettings);
        add(lConnected);
    }
}
