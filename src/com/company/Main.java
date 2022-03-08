package com.company;

import com.company.router.Router;
import com.company.router.Routes;
import com.company.views.JFrameMain;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrameMain jFrameMain = new JFrameMain();
        jFrameMain.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrameMain.setBounds(0, 0, 1000, 1000);
        jFrameMain.setLocationRelativeTo(null);
        jFrameMain.setVisible(true);

        Router.instance = new Router(jFrameMain);
        Router.instance.navigate(Routes.Home);
    }
}
