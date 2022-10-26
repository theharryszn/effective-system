package com.abidemiope.lesson11;

// BorderLayout - NORTH,EAST,WEST,SOUTH,CENTER
// GridLayout - rows, columns, hGap, vGap
// FlowLayout - LEFT, RIGHT, LEADING, TRAILING, CENTER, gap
// BoxLayout - X_AXIS, Y_AXIS, LINE_AXIS, PAGE_AXIS

import javax.swing.*;
import java.awt.*;

public class App {

    public Frame appFrame;

    public App() {
        appFrame = new Frame("App");

        Button b1 = new Button("NORTH");; // the button will be labeled as NORTH
        Button b2 = new Button("SOUTH");; // the button will be labeled as SOUTH
        Button b3 = new Button("EAST");; // the button will be labeled as EAST
        Button b4 = new Button("WEST");; // the button will be labeled as WEST
        Button b5 = new Button("CENTER");; // the button will be labeled as CENTER

        appFrame.add(b1); // b1 will be placed in the North Direction
        appFrame.add(b2);  // b2 will be placed in the South Direction
        appFrame.add(b3);  // b2 will be placed in the East Direction
        appFrame.add(b4);  // b2 will be placed in the West Direction
        appFrame.add(b5);  // b2 will be placed in the Center

        appFrame.setLayout(new BoxLayout(appFrame,BoxLayout.PAGE_AXIS));
        appFrame.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        appFrame.setSize(400, 630);
        appFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new App();
    }
}
