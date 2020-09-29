package DrawUtils.Home;

import DrawUtils.Drawable;
import Enums.Sections;
import Enums.Windows;

import java.awt.*;

public class Section implements Drawable {
    private int x;
    private int y;
    private Sections type;
    private int widthSection;
    private int heightSection;
    private boolean isLeft;

    public Section (int x, int y, int widthSection, int heightSection, Sections type, boolean isLeft) {
        this.x = x;
        this.y = y;
        this.widthSection = widthSection;
        this.heightSection = heightSection;
        this.type = type;
        this.isLeft = isLeft;
    }

    public void draw(Graphics2D gr) {
        gr.setColor(Color.lightGray);
        gr.fillRect(x, y, widthSection, heightSection);
        gr.setColor(Color.black);
        gr.drawRect(x, y, widthSection, heightSection);

        switch (type) {
            case PORCH:
                Porch porch = new Porch(x, y, 3 + (int) (3 * Math.random()));
                porch.draw(gr);
                break;
            case WINDOW:
                if (isLeft) {
                    gr.setColor(Color.blue);
                    gr.fillRect(x, y + heightSection / 2, 45, 10);
                    gr.setColor(Color.black);
                    gr.drawRect(x, y + heightSection / 2, 45, 10);

                }
                int width = 100;    //ширина окна
                int height = 75;    //высота окна

                int xWindow = x + (widthSection - width) / 2;
                int yWindow = y + (heightSection - height) / 2 - 10;
                Windows[] enumWindows = Windows.values();
                Window window = new Window(xWindow, yWindow, width, height, enumWindows[(int) (5 * Math.random())]);
                window.draw(gr);
                break;
        }
    }
}
