package Kevil.Karnage;

import java.awt.*;

public class Porch {
    //координаты левого верхнего угла
    private int x;
    private int y;
    private int countColumn;

    private int marginPorch = 10;

    private int blockColumns = 50;
    private int betweenBlocksColumns = 80;

    private int roofSize = 180;
    private int roofThicknes = 10;


    public Porch (int x, int y, int countColumn) {
        this.x = x;
        this.y = y;

        this.countColumn = countColumn;
    }

    public void draw (Graphics2D gr) {
        Roof roof = new Roof (x + marginPorch, y + marginPorch, roofSize, roofThicknes);
        roof.draw(gr);

        int n = countColumn * 2 - 1;
        for (int i = 0; i < n + 1; i++) {
            if (i % 2 == 0) {
                gr.setColor(Color.white);
                gr.fillRect(x + marginPorch + i * blockColumns / n, y + marginPorch + roofThicknes,
                        blockColumns / n, 150 - marginPorch - roofThicknes);
                gr.setColor(Color.black);
                gr.drawRect(x + marginPorch + i * blockColumns / n, y + marginPorch + roofThicknes,
                        blockColumns / n, 150 - marginPorch - roofThicknes);

            } else {
                gr.setColor(Color.white);
                gr.fillRect(x + 200 - marginPorch - i * blockColumns / n, y + marginPorch + roofThicknes,
                        blockColumns / n, 150 - marginPorch - roofThicknes);
                gr.setColor(Color.black);
                gr.drawRect(x + 200 - marginPorch - i * blockColumns / n, y + marginPorch + roofThicknes,
                        blockColumns / n, 150 - marginPorch - roofThicknes);
            }
        }

        Door door = new Door(x + marginPorch + blockColumns, y + marginPorch + roofThicknes);
        door.draw(gr, Color.green, Color.yellow);
    }
}
