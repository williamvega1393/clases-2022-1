package com.company.views.home;

import javax.swing.*;

public class JPanelHome extends JPanel {

    private  JLabel jLabelTitle;
    public JPanelHome() {
        this.setLayout(null);

        jLabelTitle = new JLabel("Home");
        jLabelTitle.setBounds(10, 10, 100,30);
        this.add(jLabelTitle);
    }
}
