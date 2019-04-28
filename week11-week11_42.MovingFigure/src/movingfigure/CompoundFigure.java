/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package movingfigure;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Martynas Vanagas
 */
public class CompoundFigure extends Figure {

    private ArrayList<Figure> compoundFigure;

    public CompoundFigure() {
        super(0, 0);
        this.compoundFigure = new ArrayList<Figure>();
    }

    public CompoundFigure(int x, int y) {
        super(x, y);
    }

    public void add(Figure f) {
        compoundFigure.add(f);
    }

    @Override
    public void draw(Graphics graphics) {
        for (Figure figure : compoundFigure) {
            figure.draw(graphics);
        }
    }

    @Override
    public void move(int dx, int dy) {
        for (Figure figure : compoundFigure) {
            figure.move(dx, dy);
        }
    }
}
