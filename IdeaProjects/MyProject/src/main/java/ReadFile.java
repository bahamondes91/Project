import java.io.File;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
    private Scanner x;

    public void openFile(){
        try {
            x = new Scanner(new File("Saved contact.txt"));
        }catch (Exception e){
            System.out.println("Could not find file!");
        }
    }
    public void readFile1(){
        System.out.println("My saved contacts!");
        while (x.hasNext()){
            String a = x.next();
            String b = x.next();
            String c = x.next();





            System.out.println(a + " " + b + " " + c);
        }
    }


    public void closeFile1(){
        x.close();
    }

}
