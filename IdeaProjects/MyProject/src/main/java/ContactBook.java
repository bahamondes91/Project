
import java.io.*;
import java.util.ArrayList;

import java.util.List;


public class ContactBook {

    private  List<Contact> listOfContacts = new ArrayList<>();

public ContactBook(){

}
public  void contactAdd(Contact b){
    listOfContacts.add(b);


}
public void removeContact(Contact contact) {
        removeContact(contact.getName());

    }

    public void removeContact(String name) {
      Contact deleteContact = null;
      for (Contact contact:listOfContacts){
       if (contact.getName().equals(name)) {
          deleteContact = contact;
           System.out.println(contact);
       }

      }
      if (deleteContact != null){
          System.out.println("Deleting contact: " + deleteContact.getName());
          listOfContacts.remove(deleteContact);
      }else {
          System.out.println("Contact not found!");
      }

}

public void searchContact(Contact contact){
    search(contact.getName());
}
public void search(String name){
    List<Contact> result = new ArrayList<>();
   for (Contact b: listOfContacts){
       if (b.getName().contains(name) || b.getEmail().contains(name)){
           result.add(b);
       }
   }
   if (!result.isEmpty()){
       System.out.println("----found result----");
       for (Contact b: result){
           System.out.println("Name: " + b.getName() + " Email " + b.getEmail());
       }
   } else{
       System.out.println("No result with: " + name);
   }

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

    public void saveData() {
        try {
            File newTextFile = new File("textfile.txt");
            PrintStream fw = new PrintStream(newTextFile);

            for (Contact contact: listOfContacts){
                fw.println(contact);
            }

            fw.close();

        } catch (IOException io) {
            io.printStackTrace();
        }

    }
    public void readdata() throws IOException {

        File file = new File("textfile.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);;
        }
        reader.close();
    }


}

