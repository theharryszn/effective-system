package com.abidemiope.lesson9;

import javax.swing.*;

public class App {
    public JFrame appFrame;
    public String[] buttons = {
            "C", "0", "1", "X",
            "2", "3", "4", "/",
            "5", "6", "7", "-",
            "8", "9", "0", "+",
            "AC","DEL", "." , "="
    };

    public double fNum = 0, sNum = 0;
    public String operator;

    public App() {

        appFrame = new JFrame("App");
        appFrame.setResizable(false);

        JTextField screen = new JTextField("0");
        screen.setBounds(0, 0, 400, 100);
        screen.setEditable(false);

        appFrame.add(screen);

        int x = 0, y = 0;

        for (String btnText: buttons) {
            JButton btn = new JButton(btnText);

            btn.setBounds( 100 * x, 100 + 100 * y, 100, 100 );
            appFrame.add(btn);
            x++;
            if(x % 4 == 0) {
                y++;
                x = 0;
            }

            btn.addActionListener(e -> {
                switch (btnText){
                    case "0":
                    case "1":
                    case "2":
                    case "3":
                    case "4":
                    case "5":
                    case "6":
                    case "7":
                    case "8":
                    case "9":
                        if(screen.getText().equals("0")) {
                            screen.setText(btnText);
                        }else  {
                            screen.setText(screen.getText() + btnText);
                        }
                        break;
                    case ".":
                        screen.setText(screen.getText() + btnText);
                        break;
                    case "+":
                        if(fNum == 0) {
                            fNum = Double.parseDouble(screen.getText());
                        }else {
                            fNum += Double.parseDouble(screen.getText());
                        }
                        screen.setText("0");
                        operator = "+";
                        break;
                    case "-":
                        if(fNum == 0) {
                            fNum = Double.parseDouble(screen.getText());
                        }else {
                            fNum -= Double.parseDouble(screen.getText());
                        }
                        screen.setText("0");
                        operator = "-";
                        break;
                    case "/":
                        if(fNum == 0) {
                            fNum = Double.parseDouble(screen.getText());
                        }else {
                            fNum /= Double.parseDouble(screen.getText());
                        }
                        screen.setText("0");
                        operator = "/";
                        break;
                    case "X":
                        if(fNum == 0) {
                            fNum = Double.parseDouble(screen.getText());
                        }else {
                            fNum *= Double.parseDouble(screen.getText());
                        }
                        screen.setText("0");
                        operator = "*";
                        break;
                    case "C":
                        screen.setText("0");
                        break;
                    case "DEL":
                        screen.setText(screen.getText().substring(0, screen.getText().length() - 1));
                        break;
                    case "AC":
                        fNum = 0;
                        sNum= 0;
                        screen.setText("0");
                        break;
                    case "=":
                        sNum = Double.parseDouble(screen.getText());
                        double result = switch (operator) {
                            case "+" -> fNum + sNum;
                            case "-" -> fNum - sNum;
                            case "/" -> fNum / sNum;
                            case "*" -> fNum * sNum;
                            default -> 0;
                        };

                        fNum = sNum = 0;
                        screen.setText(String.valueOf(result));
                }
            });
        }

        appFrame.setSize(400, 630);
        appFrame.setLayout(null);
        appFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new App();
    }
}
