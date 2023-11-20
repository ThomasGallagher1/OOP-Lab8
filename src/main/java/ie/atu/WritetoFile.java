package ie.atu;

import java.io.FileWriter;
import java.io.IOException;

public class WritetoFile {
    public static void main(String[] args)
    {
        String fileName = "File13.txt";


        try (FileWriter myFile = new FileWriter(fileName, true);){
            myFile.write("Tuesday Traffic is going to be awful");

        }catch(IOException e)
        {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}