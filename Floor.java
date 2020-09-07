package Kevil.Karnage;

import java.awt.*;

public class Floor {
    private boolean first = false;
    private int x;
    private int y;
    private int countSections;

    private int heightSection = 150;
    private int widthSection = 200;


    public Floor (int x, int y, int countSections) {
        this.x = x;
        this.y = y;
        this.countSections = countSections;
    }

    public void draw (Graphics2D gr, int numberFloor) {
        boolean option;
        if (numberFloor == 1) {
            option = true;
        } else {
            option = false;
        }

        Section section;
        for (int i = 0; i < countSections; i++) {
            if (option) {
                section = new Section(x + i * widthSection, y, (int) (1 + 2 * Math.random()));
            } else {
                section = new Section(x + i * widthSection, y, 1);
            }
            section.draw(gr, widthSection, heightSection);
        }
    }

    public int getHeightSection() {
        return heightSection;
    }

    public int getWidthSection() {
        return widthSection;
    }

    public void setXAndY(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
