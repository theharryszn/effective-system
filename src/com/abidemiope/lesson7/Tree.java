package com.abidemiope.lesson7;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class Tree {
    public JFrame appFrame;

    public Tree() {
        appFrame = new JFrame("Tree");

        DefaultMutableTreeNode files = new DefaultMutableTreeNode("Files");
        DefaultMutableTreeNode documents = new DefaultMutableTreeNode("documents");
        DefaultMutableTreeNode downloads = new DefaultMutableTreeNode("downloads");

        files.add(documents);
        files.add(downloads);

        DefaultMutableTreeNode file1 = new DefaultMutableTreeNode("index.html");
        DefaultMutableTreeNode file2 = new DefaultMutableTreeNode("app.js");

        documents.add(file1);
        documents.add(file2);

        JTree fileExplorer = new JTree(files);

        fileExplorer.setBounds(20, 20, 300, 200);

        appFrame.add(fileExplorer);


        appFrame.setSize(400, 400);
        appFrame.setLayout(null);
        appFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new Tree();
    }
}
