package Kevil.Karnage;

import java.awt.*;

public class Section {
    private int x;
    private int y;
    private int type;
    private int widthSection;
    private int heightSection;


    public Section (int x, int y, int widthSection, int heightSection, int type) {
        this.x = x;
        this.y = y;
        this.widthSection = widthSection;
        this.heightSection = heightSection;
        this.type = type;
    }

    public void draw(Graphics2D gr) {
        gr.setColor(Color.lightGray);
        gr.fillRect(x, y, widthSection, heightSection);
        gr.setColor(Color.black);
        gr.drawRect(x, y, widthSection, heightSection);

        if (type == 0) {
            Porch porch = new Porch(x, y, 3 + (int) (3 * Math.random()));
            porch.draw(gr);
        }
        if (type == 1) {
            int width = 100;    //ширина окна
            int height = 75;    //высота окна
            int xWindow = x + (widthSection - width) / 2;
            int yWindow = y + (heightSection - height) / 2 - 10;
            Window window = new Window(xWindow, yWindow, width, height, (int) (5 * Math.random()));
            window.draw(gr);
        }
    }
}
