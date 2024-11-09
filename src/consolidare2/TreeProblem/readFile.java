package consolidare2.TreeProblem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class readFile {

    public static ArrayList<String> readFileMethod()
    {
        System.out.println("The content of the file is:");
        ArrayList<String> myArrayList = new ArrayList<>();
        try {
            File myObj = new File("/Users/danacampean/IdeaProjects/DaNaCampean_sessions/src/consolidare2/treeFile");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myArrayList.add(data);
                System.out.println(data);


           }
          myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return myArrayList;

    }



}
