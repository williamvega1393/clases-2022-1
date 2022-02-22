package com.company.panels.components;

import javax.swing.*;
import java.awt.*;

public class JPanelFlow extends JPanel {

    public JPanelFlow() {
        FlowLayout flowLayout = new FlowLayout();
        flowLayout.setAlignment(FlowLayout.RIGHT);
        setLayout(flowLayout);

        JButton jButton1 = new JButton("jButton1");
        jButton1.setBounds(0, 0, 100, 30);
        add(jButton1);

        JButton jButton2 = new JButton("jButton2");
        jButton2.setBounds(50, 50, 100, 30);
        add(jButton2);
    }
}
