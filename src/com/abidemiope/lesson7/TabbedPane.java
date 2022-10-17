package com.abidemiope.lesson7;

import javax.swing.*;
import java.awt.*;

public class TabbedPane {
    public JFrame appFrame;

    public TabbedPane() {
        appFrame = new JFrame("Progress");

        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Hello World"));
        panel1.setBackground(Color.RED);

        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("How are you World"));
        panel2.setBackground(Color.BLUE);

        JPanel panel3 = new JPanel();
        panel3.add(new JLabel("Wisdom"));
        panel3.setBackground(Color.GREEN);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.add("Main", panel1);
        tabbedPane.add("Second", panel2);
        tabbedPane.add("Third", panel3);

        tabbedPane.setBounds(20, 20, 400, 400);

        appFrame.add(tabbedPane);

        appFrame.setSize(600, 600);
        appFrame.setLayout(null);
        appFrame.setVisible(true);
    }
    public static void main(String[] args) {
        new TabbedPane();
    }
}
