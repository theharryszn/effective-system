package com.abidemiope.lesson7;

import javax.swing.*;

public class App {
    public JFrame appFrame;

    public App() {
        appFrame = new JFrame("Progress");

        JProgressBar progressBar = new JProgressBar();

        progressBar.setBounds(50, 50, 100, 40);

        progressBar.setValue(0);
        progressBar.setString("Loading");
        progressBar.setStringPainted(true);
        appFrame.add(progressBar);

        appFrame.setSize(600, 600);
        appFrame.setLayout(null);
        appFrame.setVisible(true);

        int i = 0;
        while (i < 100) {
            progressBar.setValue(i);
            i += 10;
            try {
                Thread.sleep(1000);
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new App();
    }
}
