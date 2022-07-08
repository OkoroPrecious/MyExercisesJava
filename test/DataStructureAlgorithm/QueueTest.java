package DataStructureAlgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class QueueTest {
    Queue queue;

    @BeforeEach
    void setUp() {
        queue = new Queue();
    }

    @Test
    void testThatQueueIsEmpty(){
        assertTrue(queue.isEmpty());
    }

    @Test
    void testThatOneItemIsAddedAndQueueIsNotEmpty(){
        queue.Enqueue("Rose");
        queue.
    }


}
