package com.company.router;

import com.company.panels.JPanelPanels;
import com.company.views.JFrameMain;
import com.company.views.home.JPanelHome;
import com.company.views.register.JPanelRegister;

import javax.swing.*;
import java.awt.*;

public record Router(JFrameMain jFrameMain) {
    public static Router instance = null;

    public void navigate(Routes route) {
        switch (route) {
            case Home -> goTo(new JPanelHome());
            case Register -> goTo(new JPanelRegister());
            case Panels -> goTo(new JPanelPanels());
        }
    }

    private void goTo(JPanel jPanel) {
        jFrameMain.getContentPane().removeAll();
        jFrameMain.jPanel = jPanel;
        jFrameMain.jPanel.setBounds(0, 0, jFrameMain.getWidth(), jFrameMain.getHeight());
        jFrameMain.jPanel.setBackground(Color.white);
        jFrameMain.add(jFrameMain.jPanel);
        jFrameMain.repaint();
    }
}
