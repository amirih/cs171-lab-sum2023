package cs171.sum2023.lab5.FileManager;


import java.io.*;

public class AF extends FileManager implements Customizable {

    public AF() {

    }

    public void customize(String firstInput, String secondInput, String outputName) throws IOException {
        BufferedReader input1Reader = new BufferedReader(new FileReader(firstInput));
        BufferedReader input2Reader = new BufferedReader(new FileReader(secondInput));
        FileWriter outputWriter = new FileWriter(outputName);

        String lineInput1 = null;
        String lineInput2 = null;

        while (((lineInput1 = input1Reader.readLine()) != null && (lineInput2 = input2Reader.readLine()) != null)
                || ((lineInput1 = input1Reader.readLine()) != null)
                || ((lineInput2 = input2Reader.readLine()) != null)) {

            if (lineInput1 != null) {
                outputWriter.write(lineInput1);
                outputWriter.write("\n");
            }
            if (lineInput2 != null) {
                outputWriter.write(lineInput2);
                outputWriter.write("\n");
            }
        }

        input1Reader.close();
        input2Reader.close();
        outputWriter.close();
    }

    public void customize(String input1, String input2) throws IOException {
        String output = "/home/emo/IdeaProjects/cs171-lab-sum2023/src/output.txt";
        this.customize(input1, input2, output);
    }

    public static void main(String[] args) throws IOException {
        String input1 = "/home/emo/IdeaProjects/cs171-lab-sum2023/src/input1.txt";
        String input2 = "/home/emo/IdeaProjects/cs171-lab-sum2023/src/input2.txt";
        String output = "/home/emo/IdeaProjects/cs171-lab-sum2023/src/output.txt";

        AF fileManager = new AF();
        // fileManager.customize(input1, input2);
        fileManager.customize(input1, input2, output);
        fileManager.read(input1);

    }

    @Override
    void read(String input) throws IOException {
        BufferedReader stringReader = new BufferedReader(new FileReader(input));
        String myLine = null;
        while ((myLine = stringReader.readLine()) != null) {
            System.out.println(myLine);
        }
    }

    @Override
    void write(String output, String content) throws IOException {
        FileWriter outputWriter = new FileWriter(output);
        outputWriter.write(content);
    }

}