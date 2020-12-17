import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

       boolean waitingForInput = true;
        Userinterface vi = new Userinterface();

        while (waitingForInput) {


            try {
                vi.EnterInteger();


            }catch (InputMismatchException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}
