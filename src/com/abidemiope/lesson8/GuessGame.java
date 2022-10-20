package com.abidemiope.lesson8;

import javax.swing.*;
import java.util.Random;

public class GuessGame {

    public JFrame appFrame;
    public Random random = new Random();
    public int randomInt;
    public GuessGame() {
        appFrame = new JFrame("GuessGame");

        JButton generateBtn = new JButton("Generate");
        generateBtn.addActionListener(e -> randomInt = random.nextInt(10));
        JTextField textField = new JTextField();

        JLabel message = new JLabel("Click check to see the result");

        JButton checkBtn = new JButton("Check");
        checkBtn.addActionListener(e -> {
            if(Integer.parseInt(textField.getText()) == randomInt) {
                message.setText("You win: " + randomInt + " was generated");
            }else  {
                message.setText("You lose: " + randomInt + " was generated");
            }
        });

        message.setBounds(50, 50, 300, 50);
        textField.setBounds(50,110, 100, 50);
        generateBtn.setBounds(50,160, 100, 50);
        checkBtn.setBounds(50,210, 100, 50);

        appFrame.add(message);
        appFrame.add(textField);
        appFrame.add(generateBtn);
        appFrame.add(checkBtn);
        appFrame.setSize(600, 600);
        appFrame.setLayout(null);
        appFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new GuessGame();
    }
}
