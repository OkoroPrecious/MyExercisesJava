package TurtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static TurtleGraphics.Direction.EAST;
import static TurtleGraphics.Direction.SOUTH;
import static javax.swing.SwingConstants.WEST;
import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    private Turtle ijapa;

    @BeforeEach
    public void setUp() {
        ijapa = new Turtle();
    }

    @Test
    public void turtleCanBeCreatedTest(){
        assertNotNull(ijapa);
    }

    @Test
    public void penIsUpByDefaultTest(){
        assertTrue(ijapa.isPenUp());
    }

    @Test
    public void turtleCanMovePenDownTest(){
        assertTrue(ijapa.isPenUp());
        ijapa.penDown();
        assertFalse(ijapa.isPenUp());
    }

    @Test
    public void turtleCanBeTurnedBackUpTest(){
       ijapa.penDown();
       assertFalse(ijapa.isPenUp());

       ijapa.penUp();
       assertTrue(ijapa.isPenUp());

    }

    @Test
    public void whenFacingEast_turtleCanTurnRightTest(){
        assertSame(EAST, ijapa.getCurrentDirection());

        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    public void whenFacingSouth_turtleCanTurnRightTest(){
      ijapa.turnRight();
      ijapa.turnRight();
      assertEquals(WEST,ijapa.getCurrentDirection());
    }









            
}
