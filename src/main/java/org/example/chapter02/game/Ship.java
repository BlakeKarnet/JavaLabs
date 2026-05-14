package main.java.org.example.chapter02.game;

public class Ship {
    private final int x;
    private final int y;
    private final int size;
    private final Direction orientation;
    private int hp;

    public Ship(int x, int y, int size, Direction orientation) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.orientation = orientation;
        this.hp = size;
    }

    public boolean isAlive() {
        return this.hp > 0;
    }

    public boolean isHorizontal() {
        return this.orientation == Direction.HORIZONTAL;
    }

    public boolean isVertical() {
        return this.orientation == Direction.VERTICAL;
    }

    public boolean containsCell(int x, int y) {
        if (isHorizontal()) {
            return this.y == y &&
                    x >= this.x &&
                    x <= this.x + this.size - 1;
        }

        return this.x == x &&
                y >= this.y &&
                y <= this.y + this.size - 1;
    }

    public void hit() {
        if (hp > 0) {
            hp--;
        }
    }
}