package me.kobarjan.chat.window;

import me.kobarjan.chat.window.Frame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

public class Gui {
    public static void buttons() {

        JButton quitButton = new JButton("Quit");

        quitButton.addActionListener((ActionEvent event) -> {
            System.exit(0);
        });
        createLayout();
    }

    private static void createLayout(JFrame frame, JComponent... arg) {

        Container pane = frame.getContentPane();
        GroupLayout g1 = new GroupLayout(pane);
        pane.setLayout(g1);
    }
}
