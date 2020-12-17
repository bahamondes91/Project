import com.sun.tools.javac.Main;

import javax.xml.namespace.QName;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Userinterface {

    ContactBook vi = new ContactBook();
    Scanner scanner = new Scanner(System.in);

    public void EnterInteger(){
        Scanner scanner = new Scanner(System.in);
        Integer input;


        try {

            System.out.println("-----");
            System.out.println("1. Add contact.");
            System.out.println("2. Show contact.");
            System.out.println("3. Remove contact.");
            System.out.println("4. Exit program");

            input = scanner.nextInt();

        }catch (InputMismatchException ex) {
            throw new InputMismatchException("that's not a number please try again");
        }

        switch (input) {
            case 1:
                addContact();
                break;
            case 2:
                show();
                break;
            case 3:
                removeContact();
                break;
            case 4:

                break;

        }


    }

    public void addContact(){



        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Email: ");
        String email = scanner.nextLine();
        Contact b = new Contact(name,email);

        vi.contactAdd(b);


    }

    public void removeContact(){
        System.out.println("Name: ");
        String name = scanner.nextLine();
        Contact b = new Contact(name,"");

        vi.removeContact(b);

    }

    public void show(){

       vi.getListOfContacts();
    }


}
