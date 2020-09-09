package Kevil.Karnage;

import java.awt.*;
import java.util.Random;

public class Section {
    private int x;
    private int y;
    private int option;


    public Section (int x, int y, int option) {
        this.x = x;
        this.y = y;
        this.option = option;
    }

    public void draw(Graphics2D gr, int widthSection, int heightSection) {

        gr.setColor(Color.lightGray);
        gr.fillRect(x,y,widthSection, heightSection);
        gr.setColor(Color.black);
        gr.drawRect(x,y,widthSection, heightSection);

        if (option != 6) {
            Window window = new Window(x, y, option);
            window.setX(x + (widthSection - window.getWidth()) / 2);
            window.setY(y + (heightSection - window.getHeight()) / 2 - 10);
            window.draw(gr);
        } else {
            Porch porch = new Porch(x, y, (int) (3 + 3 * Math.random()));
            porch.draw(gr);
        }
    }
}
