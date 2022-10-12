package com.abidemiope.lesson6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public JFrame appFrame;
    public Main() {
        appFrame = new JFrame();

        appFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        appFrame.setSize(400, 800);
        appFrame.setLayout(null);
        appFrame.setVisible(true);

        JOptionPane.showMessageDialog(appFrame, "Hello World");

        String name = JOptionPane.showInputDialog(appFrame, "Enter name");

        System.out.println(name);

        appFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int option = JOptionPane.showConfirmDialog(e.getComponent(), "Are you sure you want to exit?", "Exit Application", JOptionPane.YES_NO_OPTION);

                if (option == JOptionPane.YES_OPTION) {
                    appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }
        });
    }
    public static void main(String[] args) {
        new Main();

    }
}
