package com.company.views;

import com.company.router.Router;
import com.company.router.Routes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainListener implements ActionListener {
    private JFrameMain jFrameMain;

    public MainListener(JFrameMain jFrameMain) {
        this.jFrameMain = jFrameMain;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ActionsMain actionsMain = ActionsMain.valueOf(e.getActionCommand());
        switch (actionsMain) {
            case GO_TO_HOME -> Router.instance.navigate(Routes.Home);
            case GO_TO_REGISTER -> Router.instance.navigate(Routes.Register);
        }
    }


}
