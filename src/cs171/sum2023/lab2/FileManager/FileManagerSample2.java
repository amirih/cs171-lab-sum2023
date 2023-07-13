package cs171.sum2023.lab2.FileManager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManagerSample2 {


    public void customize(String firstInput, String secondInput, String outputName) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter(outputName));

        BufferedReader firstReader = new BufferedReader(new FileReader(firstInput));
        BufferedReader secondReader = new BufferedReader(new FileReader(secondInput));

        String firstLine = null;
        String secondLine = null;

        while ((((firstLine = firstReader.readLine()) != null) && ((secondLine = secondReader.readLine()) != null)) || ((firstLine = firstReader.readLine()) != null) || ((secondLine = secondReader.readLine()) != null)) {

            writer.write(firstLine);
            writer.newLine();
            writer.write(secondLine);
            writer.newLine();

        }
        firstReader.close();
        secondReader.close();
        writer.close();
    }

    public void customize(String input1, String input2) throws IOException {
        String output = "src/output.txt";
        this.customize(input1, input2, output);
    }

    public static void main(String[] args) throws IOException {
        String input1 = "src/input1.txt";
        String input2 = "src/input2.txt";
        String output = "src/output.txt";

        FileManagerSample2 fileManager = new FileManagerSample2();
//        fileManager.customize(input1, input2);
        fileManager.customize(input1, input2, output);

    }

}
