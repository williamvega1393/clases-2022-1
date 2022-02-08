package com.company.controllers;

import com.company.constants.Routes;
import com.company.views.home.JPanelHome;
import com.company.views.register.JPanelRegister;

import javax.swing.*;

public class MainController {

    public MainController() {
    }

    public JPanel navigate(Routes route) {
        switch (route) {
            case Home -> {
                return new JPanelHome();
            }
            case Register -> {
                return new JPanelRegister();
            }
            default -> {
                return null;
            }
        }
    }
}
