package cs171.sum2023.lab2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileManager {

    public FileManager() {

    }

    public void customize(String firstInput, String secondInput, String outputName) {

        // There might be misleading Java concepts here and in the Main;
        // If you find mismatch, ambiguity, etc. please let me know;
        // This is just my recommendation, you can use your own approach which might be better.
        // location of input1.txt and input2.txt might be also wrong.
        // Check them all!


        //TODO
        //read the first file line by line
        //read the second file line by line
        //write to output line by line (as specified in the problem)
        //save the out put with the outputName

        // Order can be:
        // Line 1 input 1
        // Line 1 input 2
        // Line 2 input 1
        // Line 2 input 2

        // Path path = Paths.get()
        // Files.exists(path)
        //  PrintWriter writer = new PrintWriter()
        // Files.readAllLines(Paths.get(firstInput));
        //  writer.printf()
        //  writer.close();




    }

    public void customize(String input1, String input2) {
        System.out.println(input1);
        System.out.println(input2);
    }
}
