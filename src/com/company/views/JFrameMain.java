package com.company.views;

import com.company.constants.Routes;
import com.company.controllers.MainController;
import com.company.views.home.JPanelHome;
import com.company.views.register.JPanelRegister;

import javax.swing.*;
import java.awt.*;

public class JFrameMain extends JFrame {

    private  MainController mainController;

    private JMenuBar jMenuBar;
    private JMenu jMenuFile;
    // File
    private JMenu jMenuItemFile;
    private JMenuItem jMenuItemProject;
    private JMenuItem jMenuItemOpen;
    // Navegación
    private JMenu jMenuNavigate;
    private JMenuItem jMenuItemHome;
    private JMenuItem jMenuItemRegister;

    // Vistas
    private JPanel jPanel;

    public JFrameMain() throws HeadlessException {
         mainController = new MainController();
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(0, 0, 1200, 800);
        setMenu();
        goTo(Routes.Home);
    }

    private void setMenu() {
        jMenuBar = new JMenuBar();
        this.setJMenuBar(jMenuBar);

        jMenuFile = new JMenu("File");
        jMenuBar.add(jMenuFile);

        jMenuItemFile = new JMenu("File");
        jMenuFile.add(jMenuItemFile);

        jMenuItemProject = new JMenuItem("Project");
        jMenuItemProject.addActionListener(e -> System.out.println("Project"));
        jMenuItemFile.add(jMenuItemProject);


        jMenuItemOpen = new JMenuItem("Open");
        jMenuItemOpen.addActionListener(e -> System.out.println("Open"));
        jMenuFile.add(jMenuItemOpen);

        // Navegación
        jMenuNavigate = new JMenu("Navegación");
        jMenuBar.add(jMenuNavigate);

        jMenuItemHome = new JMenuItem("Home");
        jMenuItemHome.addActionListener(e -> goTo(Routes.Home));
        jMenuNavigate.add(jMenuItemHome);

        jMenuItemRegister = new JMenuItem("Register");
        jMenuItemRegister.addActionListener(e -> goTo(Routes.Register));
        jMenuNavigate.add(jMenuItemRegister);

    }

    private void clean() {
        if (jPanel != null) {
            this.remove(jPanel);
        }
    }

    private void goTo(Routes route) {
        System.out.println(route.name());
        clean();
        jPanel = mainController.navigate(route);
        jPanel.setBounds(10, 10, 1200, 800);
        this.add(jPanel);
        this.repaint();
    }
}
