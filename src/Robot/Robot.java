/*package Robot;


public class Robot {

    private int x = 0;
    private int y = 0;
    private Direction direction = Direction.UP;

    Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }


    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        switch (getDirection()) {
            case DOWN:
                direction = Direction.LEFT;
                break;
            case UP:
                direction = Direction.LEFT;
                break;
            case RIGHT:
                direction = Direction.UP;
                break;
            case LEFT:
                direction = Direction.DOWN;
        }
    }


    public void turnRight() {
        switch (getDirection()) {
            case DOWN:
                direction = Direction.LEFT;
                break;
            case UP:
                direction = Direction.RIGHT;
                break;
            case RIGHT:
                direction = Direction.DOWN;
                break;
            case LEFT:
                direction = Direction.UP;
        }
    }

    public void stepForward() {
        switch (getDirection()) {
        case RIGHT:
        x++;
        break;
        case LEFT:
        x--;
        break;
        case UP:
        y++;
        break;
        case DOWN:
        y--;
        break;
        }
    }
}
*/