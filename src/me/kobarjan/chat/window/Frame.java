package me.kobarjan.chat.window;

import javax.swing.*;

public class Frame extends JFrame {

    public Frame(JButton bConnect, JButton bCPU, JButton bSettings, JButton bExit) {

        initUI();
        layoutInit(bConnect, bCPU, bSettings, bExit);
    }

    public void initUI() {
        setTitle("Window");
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void layoutInit(JButton button, JButton bCPU, JButton bSettings, JButton bExit){
        setLayout(null);
        add(button);
        add(bSettings);
        add(bCPU);
        add(bExit);
    }
}
