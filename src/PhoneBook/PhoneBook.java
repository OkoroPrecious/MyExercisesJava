package PhoneBook;

import java.util.ArrayList;
import java.util.Objects;

public class PhoneBook {
    private  ArrayList<Contact> myArray;

    PhoneBook(){
        myArray = new ArrayList<>();
    }


    public boolean isEmpty() {
        return myArray.isEmpty();
    }

    public void addNewContact(Contact contact1) {
        myArray.add(contact1);
    }

    public int getSize() {
        return myArray.size();
    }

    public void deleteContact(Contact contact) {
        myArray.remove(contact);
    }

    public Contact getContact(int index) {
        return myArray.get(index);
    }

    public ArrayList<Contact> getAllContact() {
        return myArray;
    }

    public Contact searchContact(String details) {
       for(int i = 0; i < myArray.size(); i++) {
           if (Objects.equals(myArray.get(i).getPhoneNumber(), details)) {
               return myArray.get(i);
           }
           if (Objects.equals(myArray.get(i).getName(), details)) {
               return myArray.get(i);
           }
       }
        return null;

    }

}
