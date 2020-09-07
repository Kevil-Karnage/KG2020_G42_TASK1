package Kevil.Karnage;

import java.awt.*;

public class Roof {
    private int x;
    private int y;

    private int width;
    private int height;

    public Roof(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;

        this.width = width;
        this.height = height;
    }

    public void draw (Graphics2D gr) {
        gr.setColor(Color.darkGray);
        gr.fillRect(x, y, width, height);
        gr.setColor(Color.black);
        gr.drawRect(x, y, width, height);
    }
}
