package Kevil.Karnage;

import java.awt.*;

public class Home {
    private int x;
    private int y;

    private int frame = 10;

    private int heightSection = 150;
    private int widthSection = 200;

    public Home(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D gr, int height, int width) {
        int countFloors = (int) (1 + ((y - 80 + heightSection) / heightSection) * Math.random());
        int countSections = (int) (1 + ((width - x) / widthSection) * Math.random());
        int[][] home = new int[countFloors][countSections];

        for (int i = 0; i < countSections; i++) {
            int isPorch = (int) (2 * Math.random());
            if (isPorch == 1) {
                home[0][i] = 6;
            } else {
                home[countFloors - 1][i] = (int) (5 * Math.random());
            }
        }
        for (int i = 0; i < countFloors - 1; i++) {
            for (int j = 0; j < countSections; j++) {
                home[i][j] = (int) (5 * Math.random());
            }
        }

        for (int i = 0; i < countFloors; i++) {
            Floor floor = new Floor(x, y - i * heightSection, countSections);
            floor.draw(gr, countFloors - i, home[i]);
            if (i == countFloors - 1) {
                Roof roof = new Roof(x - frame, y - (2 * frame + i * heightSection), widthSection * countSections + 2 * frame, 2 * frame);
                roof.draw(gr, (int) (2 * Math.random()));
            }
        }
    }
}
