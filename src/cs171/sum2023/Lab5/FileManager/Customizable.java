package cs171.sum2023.Lab5.FileManager;

import java.io.IOException;

// Defining an interface
public interface Customizable {
    void customize(String input1, String input2, String output) throws IOException;
    void customize(String input1, String input2) throws IOException;
}

