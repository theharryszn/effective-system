package com.abidemiope.lesson11;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayout implements ActionListener {
    public JFrame appFrame;
    Container container;
    JButton b1, b2, b3;
    java.awt.CardLayout cardLayout;

    public CardLayout() {
        appFrame = new JFrame("App");

        container = appFrame.getContentPane();

        cardLayout = new java.awt.CardLayout(40,30);

        container.setLayout(cardLayout);

        b1 = new JButton("Apple");
        b2 = new JButton("Boy");
        b3 = new JButton("Cat");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        container.add("a", b1); // first card is the button btn1
        container.add("b", b2); // first card is the button btn2
        container.add("c", b3);  // first card is the button btn3


        appFrame.setSize(400, 630);
        appFrame.setVisible(true);

    }

    public static void main(String[] args) {
        new CardLayout();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cardLayout.show(container, "a");
    }
}
