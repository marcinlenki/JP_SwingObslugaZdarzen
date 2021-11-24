package com.lenkiewiczmarcin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

/**
 * Klasa zawierająca kontruktor, który odpowiada za edycję elementów i ich zachowań
 * wyświetlanych na głównym oknie programu.
 * Klasa dziedziczy po klasie JFrame.
 */

public class MyFrame extends JFrame {

    final private Random random = new Random();
    public static final int FRAME_WIDTH = 600;
    public static final int FRAME_HEIGHT = 450;


    public MyFrame(String title) throws HeadlessException {
        super(title);

        JPanel canvas = new Canvas();
        JButton runBtn = new JButton("Run");
        JButton btn2 = new JButton("Btn2");

        runBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);

                int width = runBtn.getWidth();

                // Lewa strona przycisku jest "bezpieczna".
                if(e.getX() >= width/2) {
                    // A = (525, 389) -> położenie przycisku run.
                    // metoda nextInt(bound), zwraca liczbę pseudolosową w zakresie od 0 do bounds.
                    int x = random.nextInt(525);
                    int y = random.nextInt(389);

                    // Kiedy kursor myszy najedzie na przycisk run, jego położenie zostanie zmienione.
                    runBtn.setLocation(x, y);
                }
            }
        });


        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();



        gbc.fill = GridBagConstraints.CENTER;

        gbc.weightx = 1;
        gbc.weighty = 1;

        gbc.anchor = GridBagConstraints.LINE_END;
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(runBtn, gbc);

        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(btn2, gbc);

        gbc.weighty = 8;
        gbc.fill = GridBagConstraints.BOTH;

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(canvas, gbc);
    }
}
