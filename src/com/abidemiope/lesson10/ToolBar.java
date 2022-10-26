package com.abidemiope.lesson10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBar implements ActionListener {
    public JFrame appFrame;

    public ToolBar() {
        appFrame = new JFrame("App");
//        JToolBar toolBar = new JToolBar("Tools", JToolBar.VERTICAL);
//
//        JButton button = new JButton("File");
//        toolBar.add(button);
//
//        JButton button2 = new JButton("Edit");
//        toolBar.add(button2);
//
//        toolBar.setBounds(10, 10, 200, 50);
//
//        appFrame.add(toolBar);

        JLayeredPane pane = appFrame.getLayeredPane();
        //creating buttons
        JButton top = new JButton("Red");
        top.setBounds(20, 20, 100, 100);
        JButton middle = new JButton("Blue");
        middle.setBounds(40, 40, 100, 100);
        JButton bottom = new JButton("Green");
        bottom.setBounds(60, 60, 100, 100);
        //adding buttons on pane
        pane.add(bottom, 1);
        pane.add(middle, 2);
        pane.add(top, 3);

        top.addActionListener(this);
        middle.addActionListener(this);
        bottom.addActionListener(this);

        appFrame.setResizable(false);
        appFrame.setSize(400, 630);
        appFrame.setLayout(null);
        appFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new ToolBar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        appFrame.getLayeredPane().setComponentZOrder((Component) e.getSource(), 0);
    }
}
