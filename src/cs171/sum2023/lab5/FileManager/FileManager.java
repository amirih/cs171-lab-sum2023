package cs171.sum2023.lab5.FileManager;

import java.io.IOException;

// Defining an abstract class
abstract class FileManager {
    abstract void read(String input) throws IOException;
    abstract void write(String output, String content) throws IOException;
}