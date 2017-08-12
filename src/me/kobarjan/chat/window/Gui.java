package me.kobarjan.chat.window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static me.kobarjan.chat.conection.SocketSetup.socketSetup;

public class Gui implements ActionListener{

    protected int port;
    protected String serverIP;
    JButton bConnect, bSettings, bStartCPU, bExit;
    Font font = new Font("Arial", Font.PLAIN, 40);
    Color green = new Color(53, 181, 80);
    Color gray = new Color(240, 240, 240);

    public Gui(int port, String serverIP){
        this.port = port;
        this.serverIP = serverIP;
    }

    public JButton bConnect() {
        bConnect = new JButton("Connect");
        bConnect.setBounds(0,0,200,50);
        bConnect.setBorder(BorderFactory.createEmptyBorder());
        bConnect.setBackground(green);
        bConnect.setForeground(gray);
        bConnect.setFont(font);
        bConnect.addActionListener(this);
        return bConnect;
    }
    public JButton bSettings() {
        JButton bSettings = new JButton("Settings");
        bSettings.setBounds(200, 0, 200,50);
        bSettings.setBorder(BorderFactory.createEmptyBorder());
        bSettings.setBackground(green);
        bSettings.setForeground(gray);
        bSettings.setFont(font);
        return bSettings;
    }
    public JButton bStartCPU() {
        JButton bStartCPU = new JButton("CPU stats");
        bStartCPU.setBounds(400, 0, 200,50);
        bStartCPU.setBorder(BorderFactory.createEmptyBorder());
        bStartCPU.setBackground(green);
        bStartCPU.setForeground(gray);
        bStartCPU.setFont(font);
        return bStartCPU;
    }
    public JButton bStartRAM() {
        JButton bStartRAM = new JButton("RAM stats");
        bStartRAM.setBounds(150, 0, 50,50);
        bStartRAM.setBorder(BorderFactory.createEmptyBorder());
        bStartRAM.setBackground(green);
        bStartRAM.setForeground(gray);
        bStartRAM.setFont(font);
        return bStartCPU;
    }
    public JButton bStartHDD() {
        JButton bStartHDD = new JButton("HDD stats");
        bStartHDD.setBounds(200, 0, 50,50);
        bStartHDD.setBorder(BorderFactory.createEmptyBorder());
        bStartHDD.setBackground(green);
        bStartHDD.setForeground(gray);
        bStartHDD.setFont(font);
        return bStartCPU;
    }
    public JButton bStartProcess() {
        JButton bStartProcess = new JButton("Process List");
        bStartProcess.setBounds(250, 0, 50,50);
        bStartProcess.setBorder(BorderFactory.createEmptyBorder());
        bStartProcess.setBackground(green);
        bStartProcess.setForeground(gray);
        bStartProcess.setFont(font);
        return bStartProcess;
    }
    public JButton bExit() {
        bExit = new JButton("Exit");
        bExit.setBounds(1130, 0, 150, 50);
        bExit.setBorder(BorderFactory.createEmptyBorder());
        bExit.setBackground(green);
        bExit.setForeground(gray);
        bExit.setFont(font);
        bExit.addActionListener(this);
        return bExit;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == bConnect){
            socketSetup("localhost", port);
        } else if (source == bExit) {
            System.exit(0);
        } else if (source == bConnect) {
            socketSetup(serverIP,port);
        }
    }
}
