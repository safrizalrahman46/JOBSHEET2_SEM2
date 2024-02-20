/**
 * DragonSafrizal
 */
public class DragonSafrizal {
    private int x;
    private int y;
    private int width;
    private int height;

    public DragonSafrizal(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void moveLeft() {
        if (x > 0 && x <= width) {
            x--;
        } else {
            detectCollision();
        }
    }

    public void moveRight() {
        if (x >= 0 && x < width) {
            x++;
        } else {
            detectCollision();
        }
    }

    public void moveUp() {
        if (y > 0 && y <= height) {
            y--;
        } else {
            detectCollision();
        }
    }

    public void moveDown() {
        if (y >= 0 && y < height) {
            y++;
        } else {
            detectCollision();
        }
    }

    public void printPosition() {
        System.out.println("Posisi DragonSafrizal: (" + x + ", " + y + ")");
    }

    public void detectCollision() {
        if (x < 0 || x > width || y < 0 || y > height) {
            System.out.println("Game Over");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        DragonSafrizal DragonSafrizal = new DragonSafrizal(5, 5, 10, 10);
        DragonSafrizal.printPosition();
        DragonSafrizal.moveLeft();
        DragonSafrizal.printPosition();
        DragonSafrizal.moveRight();
        DragonSafrizal.printPosition();
        DragonSafrizal.moveUp();
        DragonSafrizal.printPosition();
        DragonSafrizal.moveDown();
        DragonSafrizal.printPosition();
    }
}