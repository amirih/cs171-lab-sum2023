package cs171.sum2023.lab5.FileManager;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String input1 = "src/input1.txt";
        String input2 = "src/input2.txt";
        String output = "src/output.txt";

        AdvancedFileManager fileManager = new AdvancedFileManager();
        fileManager.customize(input1, input2, output);

        String content = "Hello World!";
        fileManager.write("src/test.txt", content);
        fileManager.read("src/test.txt");
    }
}
