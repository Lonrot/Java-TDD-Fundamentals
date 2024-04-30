import java.util.ArrayList;

public class Compass {
    public enum Point {
        NORTH,
        EAST,
        SOUTH,
        WEST
    }

    public enum Direction {
        LEFT,
        RIGHT
    }

    private Point point;

    public static Point rotate(Point point, Direction direction) {

        switch (direction) {
            case LEFT:
                switch (point) {
                    case NORTH:
                        return Point.WEST;
                    case EAST:
                        return Point.NORTH;
                    case SOUTH:
                        return Point.EAST;
                    case WEST:
                        return Point.SOUTH;
                }
            case RIGHT:
                switch (point) {
                    case NORTH:
                        return Point.EAST;
                    case EAST:
                        return Point.SOUTH;
                    case SOUTH:
                        return Point.WEST;
                    case WEST:
                        return Point.NORTH;
                }
        }
        return point;


//        ArrayList<Point> pointsAsList = new ArrayList<Point>();
//        Point finalPoint;
//        int directionToMove = 0;
//        int startingPoint = pointsAsList.indexOf(point);
//
//        if (direction == Direction.LEFT){
//            directionToMove = -1;
//        } else if (direction == Direction.RIGHT){
//            directionToMove = 1;
//        }
//
//        finalPoint = pointsAsList.get(startingPoint + directionToMove);
//
//
//        return finalPoint;
//    }
    }
}
