/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package dungeon;

/**
 *
 * @author Martynas Vanagas
 */
public class Vampire extends Figure {

    private String type;
    private int x, y;

    public Vampire(int dx, int dy) {
        this.type = "v";
        this.x = dx;
        this.y = dy;
    }

    @Override
    public String getType() {
        return type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void move(char direction, int lenght, int height) {
        switch (direction) {
            case 'w':
                if (this.y - 1 >= 0) {
                    this.y--;
                }
                break;
            case 's':
                if (this.y + 1 < lenght) {
                    this.y++;
                }
                break;
            case 'a':
                if (this.x - 1 >= 0) {
                    this.x--;
                }
                break;
            case 'd':
                if (this.x + 1 < height) {
                    this.x++;
                }
                break;
            default:
                break;
        }
    }

    public boolean checkMove(Vampire v) {
        return (this.x + 1 == v.getX() || this.x - 1 == v.getX() || this.y + 1 == v.getY() || this.y - 1 == v.getY());
    }

    @Override
    public String toString() {
        return this.type + " " + this.x + " " + this.y;
    }
}
