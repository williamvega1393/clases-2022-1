package com.company.views.register;

import com.company.views.register.components.JPanelGraphic;

import javax.swing.*;
import java.awt.*;

public class JPanelRegister extends JPanel {

    private JLabel jLabelTitle;
    private JPanelGraphic jPanelGraphic;

    private JButton jButtonLeft;
    private JButton jButtonRight;
    private JButton jButtonUp;
    private JButton jButtonDown;

    public JPanelRegister() {
        this.setLayout(null);

        jLabelTitle = new JLabel("Register");
        jLabelTitle.setBounds(10, 10, 100, 30);
        this.add(jLabelTitle);

        jPanelGraphic = new JPanelGraphic(50, 50);
        jPanelGraphic.setBounds(0, 50, 200, 200);
        jPanelGraphic.setBackground(Color.green);
        this.add(jPanelGraphic);

        jButtonLeft = new JButton("Izquierda");
        jButtonLeft.setBounds(10, 300, 100, 30);
        jButtonLeft.addActionListener(e -> jPanelGraphic.moveLeft());
        this.add(jButtonLeft);

        jButtonRight = new JButton("Derecha");
        jButtonRight.setBounds(200, 300, 100, 30);
        jButtonRight.addActionListener(e -> jPanelGraphic.moveRight());
        this.add(jButtonRight);

        jButtonUp = new JButton("Arriba");
        jButtonUp.setBounds(100, 250, 100, 30);
        jButtonUp.addActionListener(e -> jPanelGraphic.moveUp());
        this.add(jButtonUp);

        jButtonDown = new JButton("Abajo");
        jButtonDown.setBounds(100, 350, 100, 30);
        jButtonDown.addActionListener(e -> jPanelGraphic.moveDown());
        jButtonDown.addMouseListener(new MouseListenerDown());
        this.add(jButtonDown);
    }
}
