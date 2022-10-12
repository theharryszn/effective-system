package com.abidemiope.lesson4;

import javax.swing.*;
import java.awt.*;

public class Main extends Frame {

    public String[][] students = {
            {"1", "Onome", "Java"},
            {"2", "Ebuka", "C#"},
            {"3", "Eniola", "React" },
            {"4", "Wisdom", "Node"},
            {"5", "Vera", "R"},
            {"6", "Ifeoma", "C"},
            {"7", "Tochukwu", "SQL"}
    };

    public String[] headings = {"ID", "NAME", "COURSE"};
    public int selectedRow = -1;
    public int temp = -1;
    public JTable table;
    public  ListSelectionModel listSelectionModel;

    public Main() {

        JLabel label = new JLabel("List of Students");
        label.setBounds(10, 20, 300, 50);

        add(label);

        table = new JTable(students, headings);
        table.setBounds(10,70, 400, 50 * students.length );
        table.setRowHeight(50);

        listSelectionModel = table.getSelectionModel();

        listSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listSelectionModel.addListSelectionListener((e) -> {
            if(selectedRow == table.getSelectedRow() || table.getSelectedRow() == temp){
                // do nothing since a and b cant be the same
            }else if(selectedRow != -1) {
                // Picking B and switching
                // runs when a row has been prev' selected
                switchRows(selectedRow, table.getSelectedRow());
                temp = table.getSelectedRow();
                selectedRow = -1;
            }else {
                // Picking a
                selectedRow = table.getSelectedRow();
            }
        });

        add(table);

        setSize(new Dimension(800, 600));
        setLayout(null);
        setVisible(true);
    }

    public void switchRows(int row1, int row2){
        String[] row1Data = students[row1];
        String[] row2Data = students[row2];

        String ID = row1Data[0];
        String NAME = row1Data[1];
        String COURSE = row1Data[2];

        // For ROW 1
        table.setValueAt(row2Data[0], row1, 0);
        table.setValueAt(row2Data[1], row1, 1);
        table.setValueAt(row2Data[2], row1, 2);

        // For ROW2
        table.setValueAt(ID, row2, 0);
        table.setValueAt(NAME, row2, 1);
        table.setValueAt(COURSE, row2, 2);

    }

    public static void main(String[] args) {
        new Main();
    }
}
