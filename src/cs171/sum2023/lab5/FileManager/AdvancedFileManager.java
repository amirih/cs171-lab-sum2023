package cs171.sum2023.lab5.FileManager;

import java.io.*;



public class AdvancedFileManager extends FileManager implements Customizable {
    @Override
    public void read(String input) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(input));
        String line = null;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    @Override
    public void write(String output, String content) throws IOException {
        FileWriter writer = new FileWriter(output);
        writer.write(content);
        writer.close();
    }

    @Override
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
        String output = "src/output.txt";
        this.customize(input1, input2, output);
    }


}
