package com.company.views.register.components;

public class ThreadDown extends Thread {
    private final Runnable action;

    public ThreadDown(Runnable action) {
        this.action = action;
    }

    @Override
    public void run() {
        super.run();
        action.run();
    }
}
