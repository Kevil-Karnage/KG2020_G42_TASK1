package Kevil.Karnage;

import java.awt.*;

public class Home {
    private int x;
    private int y;

    private int frame = 10;

    public Home(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D gr, int countFloors) {
        int countSection = (int) (1 + 3 * Math.random());
        Floor floor = new Floor(x, y, countSection);
        Roof roof = new Roof(x, y, floor.getWidthSection() * countSection + 2 * frame, 2 * frame);
        roof.draw(gr);
        for (int i = 0; i < countFloors; i++) {
            floor.setXAndY(x + frame, y + 2 * frame + i * floor.getHeightSection());
            floor.draw(gr, countFloors - i);
        }
    }
}
