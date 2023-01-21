package com.abidemiope.last;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Assignment implements ActionListener {
    public Frame appFrame;
    public CardLayout cardLayout;
    
    HashMap<String, String> students = new HashMap<>();
    Container cardLayoutContainer;
    
    public Assignment() {
        cardLayout = new CardLayout();
        cardLayoutContainer = new Container();
        cardLayoutContainer.setSize(300, 400);

        cardLayoutContainer.setLayout(cardLayout);

        Container toolBar = new Container();
        toolBar.setLayout(new GridLayout(1, 2));

        students.put("Wisdom", "Hello World");
        students.put("Ebuka", "Anyhow sha");
        students.put("Ifeoma", "How are you?");
        students.put("Onome", "I love Tobi");
        students.put("Eniola", "Chill first");
        
        appFrame = new Frame("Assignment");
        
        DefaultListModel<String> names = new DefaultListModel<>();

        for (String key:
             students.keySet()) {
            names.addElement(key);
        }

        JList<String> list = new JList<>(names);
        list.setFixedCellHeight(50);
        list.setFixedCellWidth(100);

        ListSelectionModel listSelectionModel = list.getSelectionModel();

        listSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        for (String key:
             students.keySet()) {
            Button btn = new Button(students.get(key));

            btn.addActionListener(this);

            cardLayoutContainer.add(key,btn);
        }


        Button prev = new Button("<-");
        Button next = new Button("->");
        prev.addActionListener(e -> cardLayout.previous(cardLayoutContainer));

        next.addActionListener(e -> cardLayout.next(cardLayoutContainer));

        listSelectionModel.addListSelectionListener(e -> {
            int selected  = listSelectionModel.getLeadSelectionIndex();

           CardLayout layout = (CardLayout) cardLayoutContainer.getLayout();

           layout.show(cardLayoutContainer, names.get(selected));

        });

        appFrame.add(list, BorderLayout.WEST);
        toolBar.add(prev);
        toolBar.add(next);
        appFrame.add(cardLayoutContainer, BorderLayout.CENTER);
        appFrame.add(toolBar, BorderLayout.SOUTH);

        appFrame.setSize(400, 630);
        appFrame.setVisible(true);

        
    }

    public static void main(String[] args) {
        new Assignment();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cardLayout.next(cardLayoutContainer);
    }
}
