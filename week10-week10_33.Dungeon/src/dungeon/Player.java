/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package dungeon;

/**
 *
 * @author Martynas Vanagas
 */
public class Player extends Figure {

    private String type;
    private int x, y;

    public Player() {
        super(0, 0);
        this.type = "@";
    }

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
    public void move(String path, int lenght, int height) {
        char[] moves = new char[path.length()];
        for (int i = 0; i < path.length(); i++) { // Get values
            moves[i] = (char) path.charAt(i);
        }

        for (int i = 0; i < moves.length; i++) { // Move player
            switch (moves[i]) {
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
    }

    @Override
    public String toString() {
        return this.type + " " + this.x + " " + this.y;
    }

    public boolean compareCoords(Vampire v) {
        return (this.x == v.getX() && this.y == v.getY());
    }
}
