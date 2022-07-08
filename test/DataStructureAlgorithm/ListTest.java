package DataStructureAlgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {
    List list;

    @BeforeEach
    void setUp(){
        list = new ArrayList();
    }

    @Test
    void newListIsEmptyTest(){
        assertTrue(list.isEmpty());
    }

    @Test
    void addition_listIsNotEmptyTest(){
        list.add("Milk");
        assertFalse(list.isEmpty());
    }

    @Test
    void removeItem_ListIsEmptyTest(){
        list.add("Milk");
        list.remove("milk");
        assertTrue(list.isEmpty());
    }

    @Test
    void addItem_sizeIncreasesTest(){
        list.add("pounded Eba");
        assertEquals(1, list.size());
    }

    @Test
    void addMoreThanOneItem_sizeIncreasesTest() {
        list.add("pounded Eba");
        list.add("Flake");
        assertEquals(2, list.size());
    }
    @Test
    void addMoreThanOneItem_removeOne_sizeDecreasesTest(){
        list.add("pounded Eba");
        list.add("Flake");
        list.remove("Flakes");
        assertEquals(1, list.size());
    }

    @Test
    void addMoreThanOneItem_removeOne_listIsNotEmptyTest(){
        list.add("pounded Eba");
        list.add("Flakes");
        list.remove("Flakes");
        assertFalse(list.isEmpty());
    }

    @Test
    void retrieveFirstAddedItemTest(){
        list.add("Flakes");
        list.add("pounded Eba");
        String gotten = list.get(0);
        assertEquals("Flakes",gotten);

    }

    @Test
    void retrieveSecondAddedItemTest(){
        list.add("Flakes");
        list.add("pounded Eba");
        String gotten = list.get(1);
        assertEquals("pounded Eba",gotten);

    }

    @Test
    void addF_GandH_removeF_getF_shouldReturnGTest(){
        list.add("Flake");
        list.add("pounded Eba");
        list.add("Darling Hair");

        list.remove("Flakes");
        String gotten = list.get(0);
        assertEquals("pounded Eba", gotten);
    }

    @Test
    void addF_GandI_removeG_getG_shouldReturnHTest() {
        list.add("Flake");
        list.add("pounded Eba");
        list.add("Darling Hair");
        list.add("Coffee");

        list.remove("Flakes");
        String gotten = list.get(1);
        assertEquals("Darling Hair", gotten);
    }

    @Test
    void addSixElements_capacityBeDoubled(){
        assertEquals(5, list.capacity());
        list.add("Flake");
        list.add("Milk");
        list.add("Coffee");
        list.add("Pounded Eba");
        list.add("Darling Hair");
        list.add("Coffee");
        assertEquals(10,list.capacity());

    }


}