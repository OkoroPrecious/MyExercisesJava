package DataStructureAlgorithm;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    Stack stack;


    @BeforeEach
    void setUp() {
        stack = new Stack();
    }

    @Test
    void stackCanBeTested(){
        assertTrue(stack.isEmpty());
    }

    @Test
    // push in stack means Add
    void testPushItemToStack(){
        stack.push("Flour");
        assertFalse(stack.isEmpty());
    }

    @Test
    // Added three items and removed one, therefore, 2 items left
    void popElementCanBeTest(){
        stack.push("bottles");
        stack.push("glasses");
        stack.push("lipton");
        stack.pop();
        assertEquals(2, stack.size());
    }

    @Test
    void peekElementCanBeTested(){
        stack.push("bottles");
        stack.push("glasses");
        stack.push("lipton");
        stack.peek();
        assertEquals(3, stack.size());
    }

    @Test
    void searchElementCanBeTested(){
        stack.push("bottles");
        stack.push("glasses");
        stack.push("lipton");
        stack.searchElement(3);
        assertEquals("lipton", stack.searchElement(2));
        assertEquals("glasses", stack.searchElement(1));
        //  System.out.println("" + stack.searchElement(1));

    }


}
