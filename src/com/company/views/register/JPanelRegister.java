package com.company.views.register;

import javax.swing.*;

public class JPanelRegister extends JPanel {

    private  JLabel jLabelTitle;
    public JPanelRegister() {
        this.setLayout(null);

        jLabelTitle = new JLabel("Register");
        jLabelTitle.setBounds(10, 10, 100,30);
        this.add(jLabelTitle);
    }
}
