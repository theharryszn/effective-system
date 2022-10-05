package com.abidemiope.lesson3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main extends Frame {

    public Main() {
        JTextArea textArea = new JTextArea("Write a comment");

        textArea.setBounds(10, 50, 200, 200);

        JLabel label = new JLabel("0");
        label.setBounds(10, 10, 200, 50);

        textArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                label.setText(String.valueOf(textArea.getText().length()));
            }
        });

        add(label);
        add(textArea);

        JCheckBox checkBox = new JCheckBox("Red", true);
        checkBox.setBounds(10, 300, 100, 50);
        add(checkBox);

        checkBox.addActionListener(e -> System.out.println(checkBox.isSelected()));

        JRadioButton r1=new JRadioButton("A) Male");
        JRadioButton r2=new JRadioButton("B) Female");
        r1.setBounds(75,50,100,30);
        r2.setBounds(75,100,100,30);

        ButtonGroup gender = new ButtonGroup();
        gender.add(r1);
        gender.add(r2);

        add(r1);
        add(r2);

        String[] names = {"James", "Peter", "David", "John"};

        JComboBox select = new JComboBox(names);

        select.setBounds(50, 50, 200, 50);

        add(select);

        String[][] students = {
                {"1", "Onome", "Java"},
                {"2", "Ebuka", "C#"},
                {"3", "Eniola", "HTML" },
                { "4", "Wisdom", "Node"}};

        String[] headings = {"ID", "NAME", "COURSE"};

        JTable table = new JTable(students, headings);

        table.setBounds(50, 50, 400, 400);
//        table.setCellEditor(null);
//        table.setCellSelectionEnabled(false);
        add(table);

        ListSelectionModel listSelectionModel = table.getSelectionModel();

//        listSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        listSelectionModel.addListSelectionListener((e) -> {
            System.out.println(table.getSelectedRowCount());
        });
        setSize(new Dimension(800, 600));
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
