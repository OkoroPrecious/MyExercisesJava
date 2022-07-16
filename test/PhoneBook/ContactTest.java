package PhoneBook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ContactTest {

    Contact contact;

    @BeforeEach
    void setUp() {
        contact = new Contact("myName", "07034723137");
    }

    @Test
    void testThatContactDetailsCanBeSet() {
        assertEquals("name", contact.getName());
        assertEquals("07034723137", contact.getPhoneNumber());
        contact.setAddress("22, okunfolami street, Lagos state");
        assertEquals("22, okunfolami street, Lagos state", contact.getAddress());
        contact.setEmail("maria@gmail.com");
        assertEquals("maria@gmail.com", contact.getEmail());
    }

    @Test
    void testThatContactCanBeDeleted() {
    }

    @Test
    void testThatContactCanBeUpdated() {
    }

    @Test
    void testThatContactCanBeEdited() {
    }
}
