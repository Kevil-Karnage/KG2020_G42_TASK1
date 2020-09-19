package Kevil.Karnage;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

//    private Sun sun = new Sun(300, 200, 50, 120, 134, Color.orange);

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;

        int heightGrass = (int) (getHeight() / 4 + getHeight() / 2 * Math.random());

        BackGround backGround = new BackGround(getWidth(), heightGrass);
        backGround.draw(gr, getHeight());


        int heightSection = 150;
        int widthSection = 200;
        int x = 100;
        int y = heightGrass - 80;

        int countFloors = (int) (1 + ((y - 80 + heightSection) / heightSection) * Math.random());
        int countSections = (int) (1 + ((getWidth() - x) / widthSection) * Math.random());
        Home home = new Home(x, y, countFloors, countSections, widthSection, heightSection);
        home.draw(gr);
    }
}
