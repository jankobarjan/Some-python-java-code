package me.kobarjan.chat.window;

import javax.swing.*;

public class Frame extends JFrame {

    public Frame(JButton bConnect, JButton bCPU, JButton bSettings) {

        initUI();
        layoutInit(bConnect, bCPU, bSettings);
    }

    public void initUI() {
        setTitle("Window");
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void layoutInit(JButton button,JButton bCPU, JButton bSettings){
        setLayout(null);
        add(button);
        add(bSettings);
        add(bCPU);
    }
}
