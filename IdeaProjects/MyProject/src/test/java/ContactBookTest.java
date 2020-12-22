import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ContactBookTest {

    @Test
    void testingAdd(){
     Contact contact1 = new Contact("bert","karlsson");
     Contact contact2 = new Contact("kalle","anka");


    ContactBook testContactBook = new ContactBook();
    testContactBook.contactAdd(contact1);
    testContactBook.contactAdd(contact2);


        List<Contact> testContact = new ArrayList<>();

        testContact.add(contact1);
        testContact.add(contact2);

        List<Contact> testContact2 = testContactBook.getListOfContacts();
        System.out.println(testContact2);

        assertEquals(testContact, testContact2);

    }

    @Test
    void testingRemove(){
        Contact contact3 = new Contact("lora","timany");
        Contact contact4 = new Contact("bert","gustavsson");
        Contact contact5 = new Contact("pernila","walhgren");

        ContactBook testContactBook2 = new ContactBook();
        testContactBook2.contactAdd(contact3);
        testContactBook2.contactAdd(contact4);
        testContactBook2.contactAdd(contact5);
        testContactBook2.removeContact(contact3);



        List<Contact> testContact3 = testContactBook2.getListOfContacts();
        System.out.println(testContact3);

        assertEquals(2, testContact3.size());
    }
}
