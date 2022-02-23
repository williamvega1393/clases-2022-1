package com.company.views;

import javax.swing.*;
import java.awt.*;

public class JFrameMain extends JFrame {

    private final MainListener mainListener;

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
    private JMenuItem jMenuItemPanels;

    public JFrameMain() throws HeadlessException {
        mainListener = new MainListener();
        this.setLayout(null);
        addKeyListener(mainListener);
        setMenu();
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
        jMenuItemHome.addActionListener(mainListener);
        jMenuItemHome.setActionCommand(ActionsMain.GO_TO_HOME.name());
        jMenuNavigate.add(jMenuItemHome);

        jMenuItemRegister = new JMenuItem("Register");
        jMenuItemRegister.addActionListener(mainListener);
        jMenuItemRegister.setActionCommand(ActionsMain.GO_TO_REGISTER.name());
        jMenuNavigate.add(jMenuItemRegister);

        jMenuItemPanels = new JMenuItem("Panels");
        jMenuItemPanels.addActionListener(mainListener);
        jMenuItemPanels.setActionCommand(ActionsMain.GO_TO_PANELS.name());
        jMenuNavigate.add(jMenuItemPanels);

    }

}
