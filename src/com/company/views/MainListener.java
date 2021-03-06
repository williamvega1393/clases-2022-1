package com.company.views;

import com.company.router.Router;
import com.company.router.Routes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainListener extends KeyAdapter implements ActionListener {

    public MainListener() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ActionsMain actionsMain = ActionsMain.valueOf(e.getActionCommand());
        switch (actionsMain) {
            case GO_TO_HOME -> Router.instance.navigate(Routes.Home);
            case GO_TO_REGISTER -> Router.instance.navigate(Routes.Register);
            case GO_TO_PANELS -> Router.instance.navigate(Routes.Panels);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 112 -> Router.instance.navigate(Routes.Home);
            case 113 -> Router.instance.navigate(Routes.Register);
            case 114 -> Router.instance.navigate(Routes.Panels);
        }
    }

}
