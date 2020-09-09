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

    public void draw (Graphics2D gr, int numberFloor, int[] floor) {
        Section section;
        for (int i = 0; i < countSections; i++) {
            section = new Section(x + i * widthSection, y, floor[i]);
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





