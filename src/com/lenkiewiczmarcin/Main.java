package com.lenkiewiczmarcin;

import javax.swing.*;

/**
 * Klasa główna zawierająca metodę statyczną main.
 */

public class Main {

    public static void main(String[] args) {
        JFrame frame = new MyFrame("Obsługa zdarzeń od myszy i klawiatury");

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(MyFrame.FRAME_WIDTH,MyFrame.FRAME_HEIGHT);
                frame.setResizable(false);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
