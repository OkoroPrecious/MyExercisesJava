package PhoneBook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {
    PhoneBook phoneBook;
    Contact contact1;
    Contact contact2;
    Contact contact3;
    Contact contact4;
    Contact contact5;
    Contact contact6;

    @BeforeEach
    void setUp() {

        phoneBook = new PhoneBook();
        contact1 = new Contact("okoro",  "07034723137");
        contact2 = new Contact("Tomi", "09033445672");
        contact3 = new Contact("Omo",  "08123456789");
        contact4 = new Contact("Boy", "08123456787");
        contact5 = new Contact("lola",  "07055892341");
        contact6 = new Contact("Maya",  "07123567892");
    }

    @Test
    void testThatPhoneBookIsEmpty() {
        assertTrue(phoneBook.isEmpty());
    }

    @Test
    void testThatPhoneBookIsNotEmpty() {
        phoneBook.addNewContact(contact1);
        phoneBook.addNewContact(contact2);
        assertFalse(phoneBook.isEmpty());
    }


    @Test
    void testThatPhoneBookSizeCanBeTested() {
        phoneBook.addNewContact(contact1);
        phoneBook.addNewContact(contact2);
        phoneBook.addNewContact(contact3);
        phoneBook.addNewContact(contact4);
        phoneBook.addNewContact(contact5);
        phoneBook.addNewContact(contact6);
        assertEquals(6, phoneBook.getSize());

    }
    @Test
    void testThatContactCanBeDeleted(){
        phoneBook.addNewContact(contact1);
        phoneBook.addNewContact(contact2);
        phoneBook.addNewContact(contact3);
        phoneBook.addNewContact(contact4);
        phoneBook.addNewContact(contact5);
        phoneBook.addNewContact(contact6);
        phoneBook.deleteContact(contact3);
        assertEquals(5, phoneBook.getSize());
    }

    @Test
    void getContactCanBeTested(){
        phoneBook.addNewContact(contact1);
        phoneBook.addNewContact(contact2);
        phoneBook.addNewContact(contact3);
        phoneBook.addNewContact(contact4);
        phoneBook.addNewContact(contact5);
        phoneBook.addNewContact(contact6);
        assertNotNull(phoneBook.getContact(4));
    }
    @Test
    void getAllContactCanBeTested(){
        phoneBook.addNewContact(contact1);
        phoneBook.addNewContact(contact2);
        phoneBook.addNewContact(contact3);
        phoneBook.addNewContact(contact4);
        phoneBook.addNewContact(contact5);
        phoneBook.addNewContact(contact6);
        assertNotNull(phoneBook.getAllContact());
    }

    @Test
    void testThatContactCanBeEdited(){
        phoneBook.addNewContact(contact1);
        phoneBook.addNewContact(contact2);
        phoneBook.addNewContact(contact3);
        phoneBook.addNewContact(contact4);
        phoneBook.addNewContact(contact5);
        phoneBook.addNewContact(contact6);
        Contact contact = phoneBook.getContact(2);
        contact.setName("Lilian");
        assertEquals("Lilian", contact.getName());
    }
    @Test
    void searchContactCanBeTested(){
        phoneBook.addNewContact(contact1);
        phoneBook.addNewContact(contact2);
        phoneBook.addNewContact(contact3);
        phoneBook.addNewContact(contact4);
        phoneBook.addNewContact(contact5);
        assertEquals("09131807593",  phoneBook.searchContact("Ola").getPhoneNumber());
        assertEquals("Ola", phoneBook.searchContact("09131807593").getName());

    }



}