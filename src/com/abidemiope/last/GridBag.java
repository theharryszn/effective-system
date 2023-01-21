package com.abidemiope.last;

import java.awt.*;

public class GridBag {
    public Frame appFrame;

    public GridBag() {
        appFrame = new Frame("App");

        GridBagLayout layout = new GridBagLayout();

        appFrame.setLayout(layout);

        Button b1 = new Button("Button1");
        b1.setSize(50, 100);

        Button b2 = new Button("Button2");
        b2.setSize(50, 100);

        Button b3 = new Button("Button3");
        b3.setSize(50, 100);

        GridBagConstraints constraints = new GridBagConstraints();

        constraints.fill = GridBagConstraints.HORIZONTAL;

        constraints.gridx = 0;
        constraints.gridy = 0;

        appFrame.add(b1, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;

        appFrame.add(b2, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;

        appFrame.add(b3,constraints);

        appFrame.setSize(400, 630);
        appFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new GridBag();
    }
}
