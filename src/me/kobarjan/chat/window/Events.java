package me.kobarjan.chat.window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static me.kobarjan.chat.conection.SocketSetup.socketSetup;

public class Events implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        int port =  6066;
        String serverIP = "";
        socketSetup(serverIP, port);
    }
}