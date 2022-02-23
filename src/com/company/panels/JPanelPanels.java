package com.company.panels;

import com.company.panels.components.JPanelBorderLayout;
import com.company.panels.components.JPanelFlow;

import javax.swing.*;

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
//        jPanel.setBorder(new CompoundBorder(
//                new EtchedBorder(), new LineBorder(Color.red)
//        ));
//        KeyListener keyListener = new KeyListener();
//        jPanel.setBackground(new Color(67, 89, 129));
//        jPanel.addKeyListener(keyListener);
//        jPanel.setFocusable(true);
//        add(jPanel);
//        jPanel.requestFocusInWindow();

        JTextField jTextField = new JTextField();
        jTextField.setBounds(10, 250, 100, 30);
        jTextField.addKeyListener(new KeyListener());
        this.add(jTextField);

        JPanelFlow jPanelFlow = new JPanelFlow();
        jPanelFlow.setBounds(10, 300, 300, 300);
        this.add(jPanelFlow);

        JPanelBorderLayout jPanelBorderLayout = new JPanelBorderLayout();
        jPanelBorderLayout.setBounds(320, 300, 300, 300);
        this.add(jPanelBorderLayout);
    }
}
