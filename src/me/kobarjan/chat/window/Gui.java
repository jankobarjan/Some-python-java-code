package me.kobarjan.chat.window;

import javax.swing.*;

public class Gui {
    public static JButton bConnect() {
        JButton bConnect = new JButton("Podaj datę");
        bConnect.setBounds(0,0,50,20);
        bConnect.addActionListener(new Events());
        return bConnect;
    }
}
