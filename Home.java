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

    public void draw(Graphics2D gr, int countFloors, int countSections) {
        int[][] home = new int[countFloors][countSections];

        for (int i = 0; i < countSections; i++) {
            int isPorch = (int) (2 * Math.random());
            if (isPorch == 1) {
                home[countFloors - 1][i] = 6;
            } else {
                home[0][i] = (int) (5 * Math.random());
            }
        }
        for (int i = 0; i < countFloors - 1; i++) {
            for (int j = 0; j < countSections; j++) {
                home[i][j] = (int) (5 * Math.random());
            }
        }

        Floor floor = new Floor(x, y, countSections);
        Roof roof = new Roof(x, y, floor.getWidthSection() * countSections + 2 * frame, 2 * frame);
        roof.draw(gr, 1);
        for (int i = 0; i < countFloors; i++) {
            floor.setXAndY(x + frame, y + 2 * frame + i * floor.getHeightSection());
            floor.draw(gr, countFloors - i, home[i]);
        }
    }
}
