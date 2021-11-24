package com.lenkiewiczmarcin;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 * Klasa pełniąca funkcję przestrzeni do rysowania.
 * Dziedziczy po klasie JPanel.
 * Aby narysować element, wybieramy pozycję na kanwie kursorem myszy i
 * potwierdzamy ją naciśnięciem lewego przycisku myszy.
 * Następnie na klawiaturze wybieramy przycisk "o", aby narysować owal lub
 * "k", aby narysować kwadrat.
 */


public class Canvas extends JPanel implements MouseInputListener {

    private Point currentMousePosition = null;
    private Sprajt sprajt = null;

    public Canvas() {
        setBorder(BorderFactory.createTitledBorder("Canvas"));
        setOpaque(false);
        setFocusable(true);

        JLabel descriptionLabel = new JLabel("Naciśnij k, aby narysować kwadrat lub o, aby narysować owal.");


        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                paintObject(e);
            }
        });

        setLayout(new BorderLayout());
        add(descriptionLabel, BorderLayout.NORTH);

        addMouseListener(this);
    }

    // Metoda rysująca kwadrat lub owal w miejscu kursora.
    private void paintObject(KeyEvent e) {
        if(currentMousePosition == null) return;

        int x = (int) currentMousePosition.getX();
        int y = (int) currentMousePosition.getY();

        if (e.getKeyCode() == KeyEvent.VK_O) {
            sprajt = new Owal(x, y);
            repaint();
        }
        else if (e.getKeyCode() == KeyEvent.VK_K) {
            sprajt = new Kwadrat(x,y);
            repaint();
        }
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        if (sprajt == null) return;
        try {
            g2d.setColor(Color.GRAY);
            sprajt.draw(g2d);
        } finally {
            g2d.dispose();
        }
    }

    // Metoda, która pobiera współrzędne kursora.
    @Override
    public void mouseClicked(MouseEvent e) {
        this.currentMousePosition = e.getPoint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
