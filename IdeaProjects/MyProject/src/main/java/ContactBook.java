import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ContactBook {

    private  List listOfContacts = new ArrayList<Contact>();

public ContactBook(){

}
public  void contactAdd(Contact b){
    listOfContacts.add(b);


}


    public void removeContact(Contact contact) {
   listOfContacts.remove(contact);
        System.out.println("du är i removecontact metoden");
    }




    public List getListOfContacts(){
        printListOfContacts(listOfContacts);
        return listOfContacts;
    }

    public void printListOfContacts(List<Contact>listOfContacts){
        System.out.println("--My Contactlist--");
        for (Contact contact : listOfContacts) {
            System.out.println(contact.toString());

        }
    }



}

