package me.kobarjan.chat.window;

import javax.swing.*;

public class Gui {
    public static JButton bConnect() {
        JButton bConnect = new JButton("Connect");
        bConnect.setBounds(0,0,100,20);
        bConnect.addActionListener(new Events());
        return bConnect;
    }
    public static JButton bSettings() {
        JButton bSettings = new JButton("Settings");
        bSettings.setBounds(100, 0, 100,20);
        return bSettings;
    }
    public static JButton bStartCPU() {
        JButton bStartCPU = new JButton("CPU stats");
        bStartCPU.setBounds(200, 0, 50,20);
        return bStartCPU;
    }
    public static JButton bStartRAM() {
        JButton bStartCPU = new JButton("RAM stats");
        bStartCPU.setBounds(150, 0, 50,20);
        return bStartCPU;
    }
    public static JButton bStartHDD() {
        JButton bStartCPU = new JButton("HDD stats");
        bStartCPU.setBounds(200, 0, 50,20);
        return bStartCPU;
    }
    public static JButton bStartProcess() {
        JButton bStartProcess = new JButton("Process List");
        bStartProcess.setBounds(250, 0, 50,20);
        return bStartProcess;
    }
}
