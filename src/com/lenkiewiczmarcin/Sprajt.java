package com.lenkiewiczmarcin;

import java.awt.*;

/**
 * Abstrakcyjna klasa bazowa reprezentująca obiekt do rysowania.
 * Posiada dwa pola, zmienną X i Y oraz abstrakcyjną metodę draw(Graphics2D g2d).
 */

public abstract class Sprajt {
    protected int x, y;

    public Sprajt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract void draw(Graphics2D g2d);
}
