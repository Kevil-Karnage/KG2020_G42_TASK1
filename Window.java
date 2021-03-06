package DrawUtils.Home;

import DrawUtils.Drawable;
import Enums.Windows;

import java.awt.*;

public class Window implements Drawable {
    //координаты левого верхнего угла окна
    private int x;
    private int y;
    private Windows type;    //количество стёкол в окне
    private int width;    //ширина окна
    private int height;    //высота окна

    private int margin = 5;    // толщина рамки окна

    //у стекла в окне может быть 2 вида ширины - во всё окно и в половину окна
    // аналогично c высотой
    private int widthGlass1;
    private int heightGlass1;
    private int widthGlass2;
    private int heightGlass2;

    //левый верхний левый угол каждого стекла может одну из 2 x-координат и одну из 2 y-координат
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Window (int x, int y, int width, int height, Windows type) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.type = type;


        widthGlass1 = width - 2 * margin;
        heightGlass1 = height - 2 * margin;
        widthGlass2 = (width - (3 * margin)) / 2;
        heightGlass2 = (height - (3 * margin)) / 2;


        x1 = x + margin;
        y1 = y + margin;
        x2 = x + 2 * margin + widthGlass2;
        y2 = y + 2 * margin + heightGlass2;
    }

    private void drawRectangleFrame(Graphics2D gr) {
        gr.setColor(Color.white);
        gr.fillRect(x, y, width, height);
        gr.setColor(Color.black);
        gr.drawRect(x, y, width, height);
        gr.setColor(Color.blue);
    }

    public void draw(Graphics2D gr) {
        //Отрисовываем основу окна: белую рамку(прямоугольник, на котором отрисуются стёкла
        //и черную границу рамки

        //Отрисовываем стёкла, в зависимости от заданного количества (от 1 до 4)
        //Для каждого стекла отрисовываем черную границу


        switch (type) {
            case FIRST:
                gr.setColor(Color.white);
                gr.fillOval(x1, y1, widthGlass1, widthGlass1);
                gr.setColor(Color.blue);
                gr.fillOval(x1 + margin, y1 + margin, widthGlass1 - 2 * margin, widthGlass1 - 2 * margin);
                gr.setColor(Color.black);
                gr.drawOval(x1, y1, widthGlass1, widthGlass1);
                gr.drawOval(x1 + margin, y1 + margin, widthGlass1 - 2 * margin, widthGlass1 - 2 * margin);
                break;
            case SECOND:
                drawRectangleFrame(gr);
                gr.fillRect(x1, y1, widthGlass1, heightGlass1);
                gr.setColor(Color.black);
                gr.drawRect(x1, y1, widthGlass1, heightGlass1);
                break;
            case THIRD:
                drawRectangleFrame(gr);
                gr.fillRect(x1, y1, widthGlass2, heightGlass1);
                gr.fillRect(x2, y1, widthGlass2, heightGlass1);

                gr.setColor(Color.black);
                gr.drawRect(x1, y1, widthGlass2, heightGlass1);
                gr.drawRect(x2, y1, widthGlass2, heightGlass1);
                break;
            case FOURTH:
                drawRectangleFrame(gr);
                gr.fillRect(x1, y1, widthGlass2, heightGlass2);
                gr.fillRect(x1, y2, widthGlass2, heightGlass2);
                gr.fillRect(x2, y1, widthGlass2, heightGlass1);

                gr.setColor(Color.black);
                gr.drawRect(x1, y1, widthGlass2, heightGlass2);
                gr.drawRect(x1, y2, widthGlass2, heightGlass2);
                gr.drawRect(x2, y1, widthGlass2, heightGlass1);
                break;
            case FIFTH:
                drawRectangleFrame(gr);
                gr.fillRect(x1, y1, widthGlass2, heightGlass2);
                gr.fillRect(x2, y1, widthGlass2, heightGlass2);
                gr.fillRect(x1, y2, widthGlass2, heightGlass2);
                gr.fillRect(x2, y2, widthGlass2, heightGlass2);

                gr.setColor(Color.black);
                gr.drawRect(x1, y1, widthGlass2, heightGlass2);
                gr.drawRect(x2, y1, widthGlass2, heightGlass2);
                gr.drawRect(x1, y2, widthGlass2, heightGlass2);
                gr.drawRect(x2, y2, widthGlass2, heightGlass2);
                break;
        }
    }
}
