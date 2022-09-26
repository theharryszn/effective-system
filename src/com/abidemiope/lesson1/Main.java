package com.abidemiope.lesson1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        new App("Lesson 1");
    }
}

class App {
    public App(String appName) {
        JFrame appFrame = new JFrame(appName); // Instance of JFrame

        Dimension dimen = new Dimension(800, 600);

        JLabel label = new JLabel("Click the button to change this text.");

        label.setBounds(0, 0, 500, 50);

        appFrame.add(label);

        JButton btn = new JButton("Click me");
        btn.setBounds(0, 50, 400, 400);


        btn.addActionListener(e -> {
            label.setText("You have clicked");
        });

        appFrame.add(btn);

        appFrame.setSize(dimen); // Setting the size
        appFrame.setLayout(null);
        appFrame.setVisible(true); // Show the frame
    }
}
