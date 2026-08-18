package com.example;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class SwingSquare extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Draw a static square that is empty/hollow inside
        int size = 200;
        int x = (getWidth() - size) / 2;
        int y = (getHeight() - size) / 2;

        g.setColor(Color.BLACK);
        g.drawRect(x, y, size, size);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Square");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.add(new SwingSquare());
        frame.setVisible(true);
    }
}
