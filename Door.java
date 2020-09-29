package DrawUtils.Home;

import DrawUtils.Drawable;

import java.awt.*;

public class Door implements Drawable {
    private int x;
    private int y;
    private Color mainColor;
    private Color secondColor;

    private int marginDoor = 10;
    private int frame = 5;

    private int width = 60;
    private int height = 120;

    public Door (int x, int y, Color mainColor, Color secondColor) {
        this.x = x;
        this.y = y;
        this.mainColor = mainColor;
        this.secondColor = secondColor;
    }

    public void draw (Graphics2D gr) {
        int x1 = x + marginDoor + frame;
        int y1 = y + marginDoor + frame;
        int width1 = width - 2 * frame;
        int height1 = 3 * (height - 4 * frame) / 5;
        int y2 = y1 + height1 + 2 * frame;
        int height2 = 2 * (height - 4 * frame) / 5;

        gr.setColor(mainColor);
        gr.fillRect(x + marginDoor, y + marginDoor, width, height);

        gr.setColor(secondColor);

        gr.fillRect(x1, y1, width1, height1);
        gr.fillRect(x1, y2, width1, height2);
        gr.fillOval(x1 + width1 - frame/2, y2 - 3 * frame / 2, frame, frame);

        gr.setColor(Color.black);
        gr.drawRect(x + marginDoor, y + marginDoor, width, height);
        gr.drawRect(x1, y1, width1, height1);
        gr.drawRect(x1, y2, width1, height2);
        gr.drawOval(x1 + width1 - frame/2, y2 - 3 * frame / 2, frame, frame);
    }
}
