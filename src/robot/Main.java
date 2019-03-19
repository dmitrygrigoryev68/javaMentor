package robot;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        File file1 = new File(" a\\b\\..\\file.txt\n");
        File file2 = new File(" a\\b\\c\\file.txt");
        File file3 = new File(" a\\.\\b\\..\\c\\.\\file.txt");
        File file4 = new File(" .\\a\\b\\..\\b\\c\\.\\file.txt");
        File file5 = new File(" a\\..\\b\\c\\file.txt");


        String fff = file1.getCanonicalPath();
        System.out.println(fff);
        String fff1 = file2.getCanonicalPath();
        System.out.println(fff1);
        String fff2 = file3.getCanonicalPath();
        System.out.println(fff2);

        String fff3 = file4.getCanonicalPath();
        System.out.println(fff3);

        String fff4 = file5.getCanonicalPath();
        System.out.println(fff4);


        Robot robot = new Robot(0, 0, Direction.UP);


        //  moveRobot(robotConnectionManager, 3, 0);

    }

    private static void moveRobot1(Robot robot, int endX, int endY) {

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


  /*  public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {

        for (int i = 0; i < 3; i++) {
            try (RobotConnection connection = robotConnectionManager.getConnection();) {
                connection.moveRobotTo(toX, toY);
                i = 3;
            } catch (RobotConnectionException e) {
                if (i == 2) throw e;
            }
        }
    }*/

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {

        RobotConnection connection = null;

        for (int i = 0; i < 3; i++) {
            try {
                connection = robotConnectionManager.getConnection();
                connection.moveRobotTo(toX, toY);
                i = 3;
            } catch (RobotConnectionException e) {
                if (i == 2) throw e;
            } finally {
                try {
                    if (connection != null) connection.close();
                } catch (RobotConnectionException e) {
                }
            }
        }
    }


}


