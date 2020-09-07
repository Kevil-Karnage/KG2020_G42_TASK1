package Kevil.Karnage;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    private Sun sun = new Sun(300, 200, 50, 120, 134, Color.orange);
    private Home home = new Home(100, 100);

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        home.draw(gr, (int)(1 + 4 * Math.random()));
    }
}
//заполненное fillLine и т.п.
//пустое drawLine и т.п.
// gr.setPaint(new GradientPaint()); - градиент