package DataStructureAlgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    Set set;

    @BeforeEach
    void setUp() {
        set = new bigSet();

    }
    @Test
    void testThatSetIsEmpty(){
        assertTrue(set.isEmpty());
    }

    @Test
    void addition_SetIsNotEmptyTest(){
        set.add("Goya");
        set.add("Maize");
        assertFalse(set.isEmpty());
    }

    @Test
    @DisplayName("test that set size increases when we add items")
    void setSizeIncreasesWhenWeAddItemsTest(){
        set.add("Goya");
        set.add("Maize");
        assertEquals(2, set.size());
    }

    @Test
    @DisplayName("test that set can add unique items")
    void setCanAddUniqueItems(){
        set.add("liquid soap");
        set.add("silk ");
        set.add("trouser");
        set.add("leggins" );
        set.add("cake");
        set.add("keypad");
        set.add("Table" );
        set.add("lace");
        set.add("mentos" );
        set.add("ace");

        assertEquals(10, set.size());
    }


}
