
import cs171.sum2023.lab2.FileManager;


public class Main {
    public static void main(String[] args) {
        String input1= "input1.txt";
        String input2 = "input2.txt";
        String output = "output.txt";

        FileManager fileManager = new FileManager();
//        fileManager.customize(input1, input2);
        fileManager.customize(input1, input2, output);

    }
}