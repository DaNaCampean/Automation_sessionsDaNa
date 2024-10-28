package consolidare2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile {

    public static void main (String args[])
    {
        System.out.println("The content of the file is:");
        try {
            File myObj = new File("/Users/danacampean/IdeaProjects/DaNaCampean_sessions/src/consolidare2/treeFile");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);





            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
