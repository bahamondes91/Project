import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

        Boolean waitingForInput = true;

        while (waitingForInput) {
            Userinterface vi = new Userinterface();

            try {
                vi.EnterInteger();


            }catch (InputMismatchException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}
