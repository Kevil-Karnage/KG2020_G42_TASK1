package Kevil.Karnage;

import java.awt.*;

public class Home {
    private int x;
    private int y;
    private Floor[] floors;

    private int frame = 10;

    public Home(int x, int y, int countFloors, int countSections, int widthSection, int heightSection) {
        this.x = x;
        this.y = y;
        this.floors = new Floor[countFloors];

        floors[0] = new Floor(x, y, countSections, widthSection, heightSection, true);

        for (int i = 1; i < floors.length; i++) {
            floors[i] = new Floor(x, y - i * heightSection, countSections, widthSection, heightSection, false);
        }
    }

    public void draw(Graphics2D gr) {
        for (int i = 0; i < floors.length; i++) {
            floors[i].draw(gr);
        }

        int heightRoof = 2 * frame;
        int widthRoof = floors[0].getWidthSection() * floors[0].getCountSections() + 2 * frame;
        int yRoof = y - heightRoof - (floors.length - 1) * floors[0].getHeightSection();
        Roof roof = new Roof(x - frame, yRoof, widthRoof, heightRoof);
        roof.draw(gr, (int) (2 * Math.random()));
    }
}
