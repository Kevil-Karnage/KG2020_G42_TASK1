package Kevil.Karnage;

import java.awt.*;

public class Window {
    //координаты левого верхнего угла окна
    private int x;
    private int y;

    private int countGlass;    //количество стёкол в окне

    private int margin = 5;    // толщина рамки окна
    private int width = 100;    //ширина окна
    private int height = 75;    //высота окна


    //у стекла в окне может быть 2 вида ширины - во всё окно и в половину окна
    // аналогично в высотой
    int widthGlass1;
    int heightGlass1;
    int widthGlass2;
    int heightGlass2;

    //левый верхний левый угол каждого стекла может одну из 2 x-координат и одну из 2 y-координат
    int x1;
    int y1;
    int x2;
    int y2;

    public Window (int x, int y, int countGlass) {
        this.x = x;
        this.y = y;
        this.countGlass = countGlass;


        widthGlass1 = width - 2 * margin;
        heightGlass1 = height - 2 * margin;
        widthGlass2 = (width - (3 * margin)) / 2;
        heightGlass2 = (height - (3 * margin)) / 2;


        x1 = x + margin;
        y1 = y + margin;
        x2 = x + 2 * margin + widthGlass2;
        y2 = y + 2 * margin + heightGlass2;
    }

    public void draw(Graphics2D gr) {
        //Отрисовываем основу окна: белую рамку(прямоугольник, на котором отрисуются стёкла
        //и черную границу рамки

        //Отрисовываем стёкла, в зависимости от заданного количества (от 1 до 4)
        //Для каждого стекла отрисовываем черную границу


        if (countGlass == 0) {
            gr.setColor(Color.white);
            gr.fillOval(x1, y1, widthGlass1, widthGlass1);
            gr.setColor(Color.blue);
            gr.fillOval(x1 + margin, y1 + margin, widthGlass1 - 2 * margin, widthGlass1 - 2 * margin);
            gr.setColor(Color.black);
            gr.drawOval(x1, y1, widthGlass1, widthGlass1);
            gr.drawOval(x1 + margin, y1 + margin, widthGlass1 - 2 * margin, widthGlass1 - 2 * margin);
        } else {
            gr.setColor(Color.white);
            gr.fillRect(x, y, width, height);
            gr.setColor(Color.black);
            gr.drawRect(x, y, width, height);
            gr.setColor(Color.blue);
            if (countGlass == 1) {

                gr.fillRect(x1, y1, widthGlass1, heightGlass1);
                gr.setColor(Color.black);
                gr.drawRect(x1, y1, widthGlass1, heightGlass1);
            } else if (countGlass == 2) {

                gr.fillRect(x1, y1, widthGlass2, heightGlass1);
                gr.fillRect(x2, y1, widthGlass2, heightGlass1);

                gr.setColor(Color.black);
                gr.drawRect(x1, y1, widthGlass2, heightGlass1);
                gr.drawRect(x2, y1, widthGlass2, heightGlass1);
            } else if (countGlass == 3) {

                gr.fillRect(x1, y1, widthGlass2, heightGlass2);
                gr.fillRect(x1, y2, widthGlass2, heightGlass2);
                gr.fillRect(x2, y1, widthGlass2, heightGlass1);

                gr.setColor(Color.black);
                gr.drawRect(x1, y1, widthGlass2, heightGlass2);
                gr.drawRect(x1, y2, widthGlass2, heightGlass2);
                gr.drawRect(x2, y1, widthGlass2, heightGlass1);
            } else if (countGlass == 4) {

                gr.fillRect(x1, y1, widthGlass2, heightGlass2);
                gr.fillRect(x2, y1, widthGlass2, heightGlass2);
                gr.fillRect(x1, y2, widthGlass2, heightGlass2);
                gr.fillRect(x2, y2, widthGlass2, heightGlass2);

                gr.setColor(Color.black);
                gr.drawRect(x1, y1, widthGlass2, heightGlass2);
                gr.drawRect(x2, y1, widthGlass2, heightGlass2);
                gr.drawRect(x1, y2, widthGlass2, heightGlass2);
                gr.drawRect(x2, y2, widthGlass2, heightGlass2);
            }
        }
    }

    public int getWidth () {
        return width;
    }

    public int getHeight () {
        return height;
    }

    public void setX (int x) {
        this.x = x;

        x1 = x + margin;
        x2 = x + 2 * margin + widthGlass2;

    }

    public void setY (int y) {
        this.y = y;

        y1 = y + margin;
        y2 = y + 2 * margin + heightGlass2;
    }
}