package com.abidemiope.lesson10;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public JFrame appFrame;

    public App() {
        appFrame = new JFrame("App");

        JButton btn = new JButton("Open File");
        btn.setBounds(10, 10, 100, 100);

        btn.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int i = fileChooser.showOpenDialog(appFrame);

            if (i == JFileChooser.APPROVE_OPTION) {
                File openedFile = fileChooser.getSelectedFile();
                System.out.println(openedFile.getName());
                System.out.println(openedFile.getAbsoluteFile());

                try {
                    // To read from the opened file
                    Scanner me = new Scanner(openedFile);
                    System.out.println(me.nextLine());

                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });

        appFrame.add(btn);

        appFrame.setResizable(false);
        appFrame.setSize(400, 630);
        appFrame.setLayout(null);
        appFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new App();
    }
}
