
import cs171.sum2023.lab2.FileManager;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        String input1= "src/input1.txt";
        String input2 = "src/input2.txt";
        String output = "src/output.txt";

        FileManager fileManager = new FileManager();
//        fileManager.customize(input1, input2);
        fileManager.customize(input1, input2, output);

    }
}