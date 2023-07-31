package cs171.sum2023.lab8;

import java.io.IOException;

public class CurrentDirectory {
    public static void main(String[] args) throws IOException {
        // in this example, absolute path is currentDirectory + relative path
        // we have two options, we can use absolute path or relative path.

        String currentWorkingDirectory = System.getProperty("user.dir");
        System.out.println("Current working directory: " + currentWorkingDirectory);
        String mazeOneRelativePath = "src/cs171/sum2023/lab7/A3/maze1.txt";
        String mazeOneAbsolutePath = currentWorkingDirectory + "/" + mazeOneRelativePath;

        System.out.println("Absolute path of maze1.txt: " + mazeOneAbsolutePath);
        System.out.println("Relative path of maze1.txt: " + mazeOneRelativePath);

        char[][] mazeOne = cs171.sum2023.lab7.A3.PathFinderStarter.readMaze(mazeOneAbsolutePath);
        char[][] mazeTwo = cs171.sum2023.lab7.A3.PathFinderStarter.readMaze("src/cs171/sum2023/lab7/A3/maze2.txt");
        char[][] mazeRoot = cs171.sum2023.lab7.A3.PathFinderStarter.readMaze("maze1.txt");

    }
}
