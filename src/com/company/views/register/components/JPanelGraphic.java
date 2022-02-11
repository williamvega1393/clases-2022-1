package com.company.views.register.components;

import javax.swing.*;
import java.awt.*;

public class JPanelGraphic extends JPanel {
    private int x;
    private int y;

    public JPanelGraphic(int x, int y) {
        this.x = x;
        this.y = y;
        this.setDoubleBuffered(true);
    }

    public void moveLeft() {
        x -= 5; // x = x - 5;
        if (x < 0) {
            x = 0;
        }
        this.repaint();
    }

    public void moveRight() {
        x += 5; // x = x + 5;
        if (x > this.getWidth()) {
            x = this.getWidth();
        }
        this.repaint();
    }

    public void moveUp() {
        y -= 5; // y = y - 5;
        if (y < 0) {
            y = 0;
        }
        this.repaint();
    }

    public void moveDown() {
        y += 5; // y = y + 5;
        if (y > this.getHeight()) {
            y = this.getHeight();
        }
        this.repaint();
    }

    @Override
    public void update(Graphics g) {
        super.update(g);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        draw(g);
    }

    public void draw(Graphics g) {
        g.setColor(Color.red);
        g.drawLine(10, 10, 100, 100);

        g.setColor(Color.blue);
        g.drawOval(x - 15, y - 15, 30, 30);
        g.drawString("Grafica de prueba", 30, 30);
    }
}
