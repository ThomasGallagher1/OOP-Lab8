package ie.atu;


import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Close {
    public static void main(String[] args)
    {
        String fileName = "File13.txt";


        try (PrintWriter myFile = new PrintWriter (new FileWriter(fileName, true))){
            myFile.println("Monday Traffic is going to be awful");
            myFile.printf("Thomas Gallagher");

        }catch(IOException e)
        {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
