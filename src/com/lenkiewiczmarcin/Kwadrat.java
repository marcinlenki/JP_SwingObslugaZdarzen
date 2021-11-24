package com.lenkiewiczmarcin;

import java.awt.*;

/**
 * Klasa konkretna dziedzicząca po klasie Sprajt.
 * Reprezentuje kwadrat o ustalonej wcześniej wielkości.
 * Implementuję abstrakcyjną metodę draw() z klasy rodzica.
 */

public class Kwadrat extends Sprajt {
    private final int A = 60;

    public Kwadrat(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.fillRect(x - Math.round(A/2), y - Math.round(A/2), A, A);
    }
}
