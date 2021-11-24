package com.lenkiewiczmarcin;

import java.awt.*;

/**
 * Klasa konkretna dziedzicząca po klasie Sprajt.
 * Reprezentuje owal o ustalonych wcześniej rozmiarach.
 * Implementuję abstrakcyjną metodę draw() z klasy rodzica.
 */

public class Owal extends Sprajt {

    private final int W = 60;
    private final int H= 30;

    public Owal(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.fillOval(x - Math.round(W/2), y - Math.round(H/2), W, H);
    }
}
