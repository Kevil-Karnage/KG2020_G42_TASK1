package Kevil.Karnage;

import java.awt.*;

public class Clouds {
    private int x;
    private int y;
    private int r;
    private int type;

    public Clouds(int x, int y, int r, int type) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.type = type;
    }

    public void draw (Graphics2D gr) {
        if (type == 0) {
            gr.setColor(Color.white);
        } else {
            gr.setColor(Color.lightGray);
        }
        int R;
        int n = 5 + (int) (5 * Math.random());
        for (int i = 0; i < 5; i++) {
            R = (int) (2 * r + 3 / 2 * r * Math.random());
            gr.fillOval(x + i * r, y + (int) (R / 2 * Math.random()), R, R);

            R = (int) (2 * r + 3 / 2 * r * Math.random());
            gr.fillOval(x + i * r, y + (int) (50 * Math.random()), R, R);
        }

    }
}
