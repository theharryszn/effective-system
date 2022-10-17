package com.abidemiope.lesson7;

import javax.swing.*;
import javax.swing.plaf.ColorChooserUI;
import java.awt.*;



public class ColorChooser {

    public JFrame appFrame;

    public ColorChooser() {
        appFrame = new JFrame("Progress");

        Container container = appFrame.getContentPane();

        JButton btn = new JButton("Click");

        btn.addActionListener(e -> {
            Color color = JColorChooser.showDialog(appFrame, "Select a color", Color.RED);
            container.setBackground(color);
        });

        btn.setBounds(50, 50, 100, 50);

        appFrame.add(btn);

        appFrame.setSize(600, 600);
        appFrame.setLayout(null);
        appFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new ColorChooser();
    }
}
