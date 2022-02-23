package com.company.panels.components;

import javax.swing.*;
import java.awt.*;

public class JPanelBorderLayout extends JPanel {
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;

    public JPanelBorderLayout() {
        setBackground(new Color(109, 143, 90));
        BorderLayout boxLayout = new BorderLayout();
        this.setLayout(boxLayout);

        jButton1 = new JButton("CENTER");
        add(jButton1, BorderLayout.CENTER);

        jButton2 = new JButton("NORTH");
        add(jButton2, BorderLayout.NORTH);

        jButton3 = new JButton("SOUTH");
        add(jButton3, BorderLayout.SOUTH);

        jButton4 = new JButton("WEST");
        add(jButton4, BorderLayout.WEST);

        jButton5 = new JButton("EAST");
        add(jButton5, BorderLayout.EAST);
    }
}
