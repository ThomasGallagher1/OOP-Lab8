package ie.atu;

import java.io.FileWriter;
import java.io.IOException;

public class WritetoFile {
    public static void main(String[] args)
    {

        try {
            FileWriter myFile = new FileWriter("File13.txt");
            myFile.write("Goodevening");
            myFile.append("\nThomas Gallagher");
            myFile.close();
        }catch(IOException e)
        {
            System.out.println("An error occured");
        }
    }
}