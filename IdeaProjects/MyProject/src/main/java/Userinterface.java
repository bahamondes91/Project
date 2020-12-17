import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Userinterface {

    public void EnterInteger(){
        Scanner scanner = new Scanner(System.in);
        Integer input;


        try {

            System.out.println("-----");
            System.out.println("1. Add contact.");
            System.out.println("2. Show contact.");
            System.out.println("3. Remove contact.");

            input = scanner.nextInt();

        }catch (InputMismatchException ex) {
            throw new InputMismatchException("thats not a number please try again");
        }

        switch (input) {
            case 1:
                addContact();
                break;
            case 2:
                show();
                break;
            case 3:
                break;
            case 4:
                break;

        }


    }

    public void addContact(){
        ContactBook vi = new ContactBook();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Email: ");
        String email = scanner.nextLine();

        Contact b = new Contact(name,email);
        vi.contactAdd(b);



    }

    public  static void show(){
        ContactBook vi = new ContactBook();
       vi.getListOfContacts();






    }


}
