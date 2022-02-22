package com.company.panels;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class JPanelPanels extends JPanel {

    public JPanelPanels() {
        setLayout(null);
        JPanel jPanel = new JPanel();
        jPanel.setBounds(10, 10, 200, 200);
//        jPanel.setBorder(new TitledBorder("Esta es una prueba"));
//        jPanel.setBorder(new EtchedBorder());
//        jPanel.setBorder(new LineBorder(Color.blue, 3));
//        jPanel.setBorder(new MatteBorder(5,5,30,30,Color.green));
//        jPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
//        jPanel.setBorder(new SoftBevelBorder(BevelBorder.RAISED) );
        jPanel.setBorder(new CompoundBorder(
                new EtchedBorder(), new LineBorder(Color.red)
        ));
        add(jPanel);

        JTextField jTextField = new JTextField();
        jTextField.setBounds(10, 250, 100, 30);
        jTextField.addKeyListener(new KeyListener());
        this.add(jTextField);
    }
}
