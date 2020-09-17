package Kevil.Karnage;

import java.awt.*;

public class BackGround {
    private int x;
    private int y;
    private int height;
    private int width;

    public BackGround(int widthGrass, int heightGrass) {
        this.width = widthGrass;
        this.height = heightGrass;

    }

    public void draw(Graphics2D gr, int fullHeight) {
        gr.setColor(new Color(0,191,255));
        gr.fillRect(0,0, width,height);
        gr.setColor(new Color(0,125,0));
        gr.fillRect(0, height, width, fullHeight - height);
    }
}
