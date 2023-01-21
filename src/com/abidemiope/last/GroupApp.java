package com.abidemiope.last;

import javax.swing.*;
import java.awt.*;

public class GroupApp {
    public JFrame appFrame;
    public GroupApp() {
        appFrame = new JFrame("App");

        Container container = appFrame.getContentPane();

        GroupLayout groupLayout = new GroupLayout(container);

        container.setLayout(groupLayout);

        JLabel label = new JLabel("Click me");

        JButton button = new JButton("Click");

        groupLayout.setHorizontalGroup(groupLayout.createSequentialGroup().addComponent(label).addGap(20).addComponent(button));

        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label)
                        .addComponent(button)
        );

        appFrame.pack();
        appFrame.setSize(400, 630);
        appFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new GroupApp();
    }
}
