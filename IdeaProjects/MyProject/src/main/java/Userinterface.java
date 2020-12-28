

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Userinterface {

   static ContactBook vi = new ContactBook();
   static Scanner scanner = new Scanner(System.in);


    public void EnterInteger() throws IOException {
        Scanner scanner = new Scanner(System.in);

        Integer input;



        try {

            System.out.println("----------------");
            System.out.println("---MENU---");
            System.out.println("1. Add contact.");
            System.out.println("2. Show contact.");
            System.out.println("3. Show saved contact.");
            System.out.println("4. Remove contact.");
            System.out.println("5. Search contact");
            System.out.println("6. Exit program");


            input = scanner.nextInt();

        }catch (InputMismatchException ex) {
            throw new InputMismatchException("that's not a number please try again");
        }

        switch (input) {
            case 1:
                addContact();
                break;
            case 2:
                showContact();
                break;
            case 3:
                showSavedContact();
                break;
            case 4:
                removeContact();
                break;
            case 5:
                searchContact();
                break;
            case 6:
                System.out.println("Shutting down...");
             System.exit(4);
                break;

        }



    }

    public void addContact(){
        System.out.println("how many contacts do you wanna add?");
        int people = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i <people ; i++) {
            System.out.println("Name: ");
            String name = scanner.nextLine();

            System.out.println("Email: ");
            String email = scanner.nextLine();
            Contact b = new Contact(name,email);

            vi.contactAdd(b);

        }

        vi.saveData();


    }

    public void removeContact(){
        System.out.println("Name: ");
        String name = scanner.nextLine();
        Contact b = new Contact(name,"");

        vi.removeContact(b);

    }

    public void searchContact(){
    System.out.println("Name: ");
    String name = scanner.nextLine();
    System.out.println("Email: ");
    String email = scanner.nextLine();
    Contact b = new Contact(name,email);

    vi.searchContact(b);

}

    public void showContact(){
        vi.getListOfContacts();
}

    public void showSavedContact() throws IOException {
       vi.readdata();
    }







}
