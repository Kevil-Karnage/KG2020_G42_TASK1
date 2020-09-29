package DrawUtils.BackGround;

import DrawUtils.Drawable;

import java.awt.*;

public class BackGround implements Drawable {
    private int x;
    private int y;
    private int height;
    private int width;
    private int fullHeight;

    public BackGround(int widthGrass, int heightGrass, int fullHeight) {
        this.width = widthGrass;
        this.height = heightGrass;
        this.fullHeight = fullHeight;
    }

    public void draw(Graphics2D gr) {
        gr.setColor(new Color(0,191,255));
        gr.fillRect(0,0, width,height);
        gr.setColor(new Color(0,125,0));
        gr.fillRect(0, height, width, fullHeight - height);

        int n = 1 + (int) (5 * Math.random());
        for (int i = 0; i < n; i++) {
            int begin = -50 + (int) (300 * Math.random());
            Clouds clouds = new Clouds(begin + width / n * i, 25, 30, (int) (2 * Math.random()));
            clouds.draw(gr);
        }
    }
}
