package me.kobarjan.chat.conection;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class GetStats {
    public static void getCPU(DataOutputStream out, DataInputStream in) {
        try {
            out.writeUTF("cpu");
            System.out.println("CPU: " + in.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void getRAM(DataOutputStream out, DataInputStream in) {
        try {
            out.writeUTF("ram");
            System.out.println("RAM: " + in.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void getHDD(DataOutputStream out, DataInputStream in) {
        try {
            out.writeUTF("hdd");
            System.out.println("HDD: " + in.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void getProcessList(DataOutputStream out, DataInputStream in) {
        try {
            out.writeUTF("proces");
            System.out.println("Process list: " + in.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
