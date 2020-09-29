package DrawUtils.Home;

import DrawUtils.Drawable;
import Enums.Sections;

import java.awt.*;

public class Floor implements Drawable {
    private int x;
    private int y;
    private Section[] sections;
    private int widthSection;
    private int heightSection;
    private boolean first;



    public Floor (int x, int y, int countSections, int widthSection, int heightSection, boolean first) {
        this.x = x;
        this.y = y;
        this.sections = new Section[countSections];
        this.widthSection = widthSection;
        this.heightSection = heightSection;
        this.first = first;

        Sections[] enumSections = Sections.values();
        if (first) {
            for (int i = 1; i < sections.length; i++) {
                sections[i] = new Section(x + i * widthSection, y, widthSection, heightSection, enumSections[(int) (2 * Math.random())], false);
            }
            sections[0] = new Section(x, y, widthSection, heightSection, enumSections[(int) (2 * Math.random())], true);
        } else {
            for (int i = 0; i < sections.length; i++) {
                sections[i] = new Section(x + i * widthSection, y, widthSection, heightSection, enumSections[1], false);
            }
        }
    }

    public void draw (Graphics2D gr) {
        for (int i = 0; i < sections.length; i++) {
            sections[i].draw(gr);
        }
    }

    public int getCountSections() {
        return sections.length;
    }

    public int getHeightSection() {
        return heightSection;
    }

    public int getWidthSection() {
        return widthSection;
    }
}
