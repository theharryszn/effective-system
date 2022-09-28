package com.abidemiope.lesson2;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {
    public static void main(String[] args) {
        JFrame appFrame = new JFrame();

        JLabel label = new JLabel("Enter Something");
        label.setBounds(10,0, 500, 30);

        JTextField textField = new JTextField("");
        textField.setBounds(10,40, 200,30);

        JTextField textField2 = new JTextField("");
        textField2.setBounds(10,80, 200,30);
//        textField.addActionListener((e -> {
//            label.setText(textField.getText());
//        }));
        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        appFrame.add(label);
        appFrame.add(textField);
        appFrame.add(textField2);
        appFrame.setSize(600, 800);
        appFrame.setLayout(null);
        appFrame.setVisible(true);
    }
}
