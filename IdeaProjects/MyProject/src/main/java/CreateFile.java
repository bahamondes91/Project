import java.io.*;
import java.lang.*;
import java.util.*;

public class CreateFile {

    private  Formatter x;

    public void openFile(){

        try {
            x = new Formatter("Saved contact.txt");

        }catch (Exception e){
            System.out.println("Error!");
        }
    }

    public void addFile(String a, String b){
        x.format("%s", a + " Email: " + b);
    }


    public void closeFile(){
        x.close();
    }
}
