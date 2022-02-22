package com.company.panels;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListener extends KeyAdapter {

    @Override
    public void keyTyped(KeyEvent e) {
        int value = e.getKeyChar();
        System.out.println("keyPressed: " + e.getKeyChar() + " code: " + e.getKeyCode() + " ascii: " + value);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int value = e.getKeyChar();
        System.out.println("keyPressed: " + e.getKeyChar() + " code: " + e.getKeyCode() + " ascii: " + value);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int value = e.getKeyChar();
        System.out.println("keyPressed: " + e.getKeyChar() + " code: " + e.getKeyCode() + " ascii: " + value);
    }
}
