import java.util.ArrayList;
import java.util.List;

public class ContactBook {

    private  List listOfContacts = new ArrayList<Contact>();

public ContactBook(){

}
public  void contactAdd(Contact b){
    listOfContacts.add(b);
    System.out.println(listOfContacts);

}



    public List getListOfContacts() {
        printListOfContacts(listOfContacts);
        System.out.println("du är i getlist");
        return listOfContacts;
    }

    public void printListOfContacts(List<Contact>listOfContacts) {
        System.out.println("du är i metoden printListOfContacts");
        for (Contact contact : listOfContacts) {
            System.out.println(contact.toString());
            System.out.println("du är i for loopen!");
        }
    }



}

