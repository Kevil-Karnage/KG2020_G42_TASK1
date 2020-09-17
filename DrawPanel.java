package Kevil.Karnage;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    private int width;
    private int height;

    private Sun sun = new Sun(300, 200, 50, 120, 134, Color.orange);


    public DrawPanel (int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;

        int heightGrass = (int) (height / 4 + height / 2 * Math.random());

        BackGround backGround = new BackGround(width, heightGrass);
        backGround.draw(gr, height);

        Home home = new Home(100, heightGrass - 80);
        home.draw(gr, height, width);

        Clouds clouds = new Clouds(100, 100, 50);
        clouds.draw(gr, width, height);
    }
}
//заполненное fillLine и т.п.
//пустое drawLine и т.п.
// gr.setPaint(new GradientPaint()); - градиент