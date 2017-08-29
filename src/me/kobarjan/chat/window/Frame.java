package me.kobarjan.chat.window;

import javax.swing.*;

public class Frame extends JFrame {

    public Frame(JButton bConnect, JLabel lConnected,JMenuBar menuBar) {

        initUI();
        layoutInit(bConnect, lConnected,menuBar);
    }

    public void initUI() {
        setTitle("Window");
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
    }
    public void layoutInit(JButton button, JLabel lConnected, JMenuBar menuBar){
        setLayout(null);
        setJMenuBar(menuBar);
        add(button);
        add(lConnected);
    }
}
