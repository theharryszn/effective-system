package com.abidemiope.lesson10;

import javax.swing.*;

public class ToggleButton {
    public JFrame appFrame;

    public ToggleButton() {
        appFrame = new JFrame("App");

        JToggleButton btn = new JToggleButton("On", true);

        btn.setBounds(10, 10, 100, 100);

        btn.addActionListener(e -> {
            if(btn.isSelected()) {
                btn.setText("On");
            }else {
                btn.setText("Off");
            }
        });

        appFrame.add(btn);

        appFrame.setResizable(false);
        appFrame.setSize(400, 630);
        appFrame.setLayout(null);
        appFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new ToggleButton();
    }
}
