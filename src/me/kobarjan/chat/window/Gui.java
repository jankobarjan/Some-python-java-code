package me.kobarjan.chat.window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static me.kobarjan.chat.conection.SocketSetup.socketSetup;

public class Gui implements ActionListener{

    protected int port;
    protected String serverIP;
    JButton bConnect, bSettings;
    JLabel lConnected;
    Font font = new Font("Arial", Font.PLAIN, 40);
    Color gray = new Color(10, 10, 10);
    int width;
    int height;

    public Gui(int port, String serverIP, int width, int height){
        this.port = port;
        this.serverIP = serverIP;
        this.width = width;
        this.height = height;
    }

    public JButton bConnect() {
        bConnect = new JButton("Connect");
        bConnect.setBounds(0,0,200,50);
        bConnect.setForeground(gray);
        bConnect.setFont(font);
        bConnect.addActionListener(this);
        return bConnect;
    }
    public JButton bSettings() {
        bSettings = new JButton("Settings");
        bSettings.setBounds(200, 0, 200,50);
        bSettings.setForeground(gray);
        bSettings.setFont(font);
        return bSettings;
    }
    public JLabel lConnected() {
        lConnected = new JLabel("xd");
        lConnected.setBounds(1000,0,200,200);
        return lConnected;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == bConnect){
            boolean connected = socketSetup("localhost", port);
            if (connected) {
                bConnect.hide();
            }
        } else if (source == bSettings) {
            System.out.println("Settings");
        }
    }
}
