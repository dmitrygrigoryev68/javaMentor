package Robot;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot(0, 0, Direction.UP);

        moveRobot(robot, 3, 0);

    }

    private static void moveRobot(Robot robot, int endX, int endY) {

        int currentX = robot.getX();
        int currentY = robot.getY();

        System.out.println(robot.getX() + " " + robot.getY() + robot.getDirection());


        if (currentX >= endX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (currentX != endX) {
                robot.stepForward();
                System.out.println("currentX >= endX " + robot.getX() + " " + robot.getY() + " " + robot.getDirection());
                currentX--;
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (currentX != endX) {
                robot.stepForward();
                System.out.println("currentX <= endX " + robot.getX() + " " + robot.getY() + " " + robot.getDirection());
                currentX++;
            }
        }

        if (currentY >= endY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            while (currentY != endY) {
                robot.stepForward();
                System.out.println("currentY >= endY " + robot.getX() + " " + robot.getY() + " " + " " + robot.getDirection());
                currentY--;
            }

        } else {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (currentY != endY) {
                robot.stepForward();
                System.out.println("currentY <= endY " + robot.getX() + " " + robot.getY() + " " + robot.getDirection());
                currentY++;
            }

        }

    }

    public static enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT

    }


    public static class Robot {

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
}

