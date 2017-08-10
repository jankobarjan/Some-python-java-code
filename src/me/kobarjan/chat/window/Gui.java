package me.kobarjan.chat.window;

import me.kobarjan.chat.conection.SocketSetup;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static me.kobarjan.chat.conection.SocketSetup.socketSetup;

public class Gui implements ActionListener{

    int port;
    JButton bConnect, bSettings, bStartCPU, bExit;

    public Gui(int port){
        port = port;
    }

    public JButton bConnect() {
        bConnect = new JButton("Connect");
        bConnect.setBounds(0,0,100,50);
        bConnect.addActionListener(this);
        return bConnect;
    }
    public static JButton bSettings() {
        JButton bSettings = new JButton("Settings");
        bSettings.setBounds(100, 0, 100,50);
        return bSettings;
    }
    public static JButton bStartCPU() {
        JButton bStartCPU = new JButton("CPU stats");
        bStartCPU.setBounds(200, 0, 50,50);
        return bStartCPU;
    }
    public static JButton bStartRAM() {
        JButton bStartCPU = new JButton("RAM stats");
        bStartCPU.setBounds(150, 0, 50,50);
        return bStartCPU;
    }
    public static JButton bStartHDD() {
        JButton bStartCPU = new JButton("HDD stats");
        bStartCPU.setBounds(200, 0, 50,50);
        return bStartCPU;
    }
    public static JButton bStartProcess() {
        JButton bStartProcess = new JButton("Process List");
        bStartProcess.setBounds(250, 0, 50,50);
        return bStartProcess;
    }
    public JButton bExit() {
        bExit = new JButton("Exit");
        bExit.setBounds(1080, 0, 200, 50);
        bExit.addActionListener(this);
        return bExit;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == bConnect){
            socketSetup("localhost", port);
        } else if (source == bExit) {
            try {
                //dispose();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }
}
