package ie.atu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Append {
    public static void main(String[] args)
    {
        String fileName = "File13.txt";


        try (FileWriter myFile = new FileWriter(fileName, true);){
            myFile.write("Tuesday Traffic is going to be awful");
            myFile.append("Thomas Gallagher");

        }catch(IOException e)
        {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
