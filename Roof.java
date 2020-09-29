package DrawUtils.Home;

import DrawUtils.Drawable;

import java.awt.*;

public class Roof implements Drawable {
    private int x;
    private int y;
    private int type;

    private int width;
    private int height;

    public Roof(int x, int y, int width, int height, int type) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.type = type;
    }

    public void draw (Graphics2D gr) {
        if (type == 0) {
            gr.setColor(Color.darkGray);
            gr.fillRect(x, y, width, height);
            gr.setColor(Color.black);
            gr.drawRect(x, y, width, height);
        } else if (type == 1) {
            int[] Xs = {x + (width / 2), x, x, x + width + 1, x + width + 1};
            int[] Ys = {y, y + (height / 2), y + height, y + height, y + (height / 2)};
            gr.setColor(Color.darkGray);
            gr.fillPolygon(Xs, Ys, 5);
            gr.setColor(Color.black);
            gr.drawPolygon(Xs, Ys, 5);
        }
    }
}
