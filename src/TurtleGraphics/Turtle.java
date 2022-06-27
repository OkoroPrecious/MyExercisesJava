package TurtleGraphics;

import static TurtleGraphics.Direction.*;

public class Turtle {
    private boolean isPenUp = true;
    private Direction currentDirection = Direction.EAST;

    public boolean isPenUp() {
        return isPenUp;
    }

    public void penDown() {
        isPenUp = false;
    }

    public void penUp(){
        isPenUp = true;
    }
    public Direction getCurrentDirection(){
        return currentDirection;
    }
    public void turnRight(){
      switch (currentDirection){
          case EAST -> face(SOUTH);
          case WEST -> face(NORTH);
          case NORTH -> face(EAST);
          case SOUTH -> face(WEST);

      }
    }

    private void face(Direction direction ){
        currentDirection = direction;
    }
}
