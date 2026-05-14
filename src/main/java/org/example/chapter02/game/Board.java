package main.java.org.example.chapter02.game;

import java.util.Random;

public class Board {
    private static final int SINGLE_DECK_COUNT = 4; //Ship
    private static final int DOUBLE_DECK_COUNT = 3;
    private static final int TRIPLE_DECK_COUNT = 2;
    private static final int FOUR_DECK_COUNT = 1;

    private static final int BOARD_SIZE = 10;
    private static final int SHIPS_COUNT = 10;

    private static final char UNKNOWN_CELL = '.';
    private static final char MISS_CELL = '*';
    private static final char HIT_CELL = 'X';
    private static final char SHIP_CELL = 'S';

    private final int size;
    private final char[][] shipsBox; // Лишнее
    private final char[][] shotsBox;
    private final Ship[] ships;
    private final Random random;
    private int shipCount;

    public Board() {
        this.size = BOARD_SIZE;
        this.shipsBox = new char[size][size];
        this.shotsBox = new char[size][size];
        this.ships = new Ship[SHIPS_COUNT];
        this.random = new Random();
        this.shipCount = 0;
        initBoxes();
    }

    public void initBoxes() {
        for (int i = 0; i < this.size; ++i) {
            for (int j = 0; j < this.size; ++j) {
                shipsBox[i][j] = UNKNOWN_CELL;
                shotsBox[i][j] = UNKNOWN_CELL;
            }
        }
    }

    public void printUpper() {
        System.out.print("  ");
        for (int i = 0; i < size; ++i) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void printShotsBox() {
        printUpper();
        for (int i = 0; i < this.size; ++i) {
            System.out.print(i + " ");
            for (int j = 0; j < this.size; ++j) {
                System.out.print(shotsBox[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printShipsBox() {
        printUpper();
        for (int i = 0; i < size; ++i) {
            System.out.print(i + " ");
            for (int j = 0; j < size; ++j) {
                System.out.print(shipsBox[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isInside(int x, int y) {
        return x >= 0 && x < size && y >= 0 && y < size;
    }

    public boolean wasShot(int x, int y) {
        return shotsBox[y][x] == MISS_CELL || shotsBox[y][x] == HIT_CELL;
    }

    public Ship findShip(int x, int y) {
        for (int i = 0; i < shipCount; ++i) {
            if (ships[i].containsCell(x, y)) {
                return ships[i];
            }
        }
        return null;
    }

    public ShootResult shoot(int shootX, int shootY) {
        if (!isInside(shootX, shootY)) {
            return ShootResult.OUTSIDE;
        }

        if (wasShot(shootX, shootY)) {
            return ShootResult.ALREADY_SHOT;
        }

        Ship shotShip = findShip(shootX, shootY);

        if (shotShip == null) {
            shotsBox[shootY][shootX] = MISS_CELL;
            return ShootResult.MISS;
        }

        shotShip.hit();
        shotsBox[shootY][shootX] = HIT_CELL;

        if (shotShip.isAlive()) {
            return ShootResult.HIT;
        }

        return ShootResult.KILL;
    }

    public boolean checkSquare(int cellX, int cellY) {
        for (int dy = -1; dy <= 1; ++dy) {
            for (int dx = -1; dx <= 1; ++dx) {
                int checkX = cellX + dx;
                int checkY = cellY + dy;

                if (isInside(checkX, checkY) && shipsBox[checkY][checkX] == SHIP_CELL) {
                    return false;
                }
            }
        }
        return true;
    }

    public int[] getShipCell(int x, int y, int i, Direction direction) {
        if (direction == Direction.VERTICAL) {
            return new int[]{x, y + i};
        }
        return new int[]{x + i, y};
    }

    public boolean checkCoordinates(int x, int y, int shipSize, Direction direction) {
        if (!isInside(x, y) || shipSize <= 0) {
            return false;
        }

        if (direction == Direction.VERTICAL && y + shipSize > this.size) {
            return false;
        }

        return direction != Direction.HORIZONTAL || x + shipSize <= this.size;
    }

    public boolean placeShip(int x, int y, int shipSize, Direction direction) { // Передаем корабль
        if (!checkCoordinates(x, y, shipSize, direction)) {
            return false;
        }

        for (int i = 0; i < shipSize; ++i) {
            int[] cell = getShipCell(x, y, i, direction);
            int cellX = cell[0];
            int cellY = cell[1];

            if (!checkSquare(cellX, cellY)) {
                return false;
            }
        }

        if (ships.length == shipCount) {
            return false;
        }

        Ship newShip = new Ship(x, y, shipSize, direction);
        ships[shipCount] = newShip;
        shipCount++;

        for (int i = 0; i < shipSize; ++i) {
            int[] cell = getShipCell(x, y, i, direction);
            int cellX = cell[0];
            int cellY = cell[1];

            shipsBox[cellY][cellX] = SHIP_CELL;
        }

        return true;
    }

    public boolean allShipsDestroyed() {
        for (int i = 0; i < shipCount; ++i) {
            if (ships[i].isAlive()) {
                return false;
            }
        }
        return true;
    }

    public Direction getRandomDirection() {
        int intDirection = random.nextInt(2);

        if (intDirection == 0) {
            return Direction.HORIZONTAL;
        }
        return Direction.VERTICAL;
    }

    public void placeRandomShip(int shipSize, int count) {
        if (shipSize < 1 || shipSize > 4) {
            throw new IllegalArgumentException("Wrong ship size");
        }

        for (int i = 0; i < count; ++i) {
            boolean placed = false;
            while (!placed) {
                int x = random.nextInt(size);
                int y = random.nextInt(size);
                Direction direction = getRandomDirection();
                placed = placeShip(x, y, shipSize, direction);
            }
        }
    }

    public void autoPlaceShips() {
        placeRandomShip(1, SINGLE_DECK_COUNT);
        placeRandomShip(2, DOUBLE_DECK_COUNT);
        placeRandomShip(3, TRIPLE_DECK_COUNT);
        placeRandomShip(4, FOUR_DECK_COUNT);
    }
}