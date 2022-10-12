package com.abidemiope.lesson5;

import javax.swing.*;
import java.awt.*;

public class Mai extends Frame {
    public Mai() {

        DefaultListModel<String> dml = new DefaultListModel<>();
        dml.addElement("Onome");
        dml.addElement("Ebuka");
        dml.addElement("Eniola");
        dml.addElement("Wisdom");
        dml.addElement("Ifeoma");
        dml.addElement("Vera");
        dml.addElement("Tochukwu");
        JList<String> list = new JList<>(dml);
        list.setBounds(20,50, 200, dml.capacity() * 50);
        list.setFixedCellHeight(50);

        ListSelectionModel listSelectionModel = list.getSelectionModel();



        add(list);

        setSize(800, 600);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Mai();
    }
}
