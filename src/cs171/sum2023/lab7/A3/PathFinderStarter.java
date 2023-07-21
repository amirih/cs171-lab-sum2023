package cs171.sum2023.lab7.A3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class PathFinderStarter {


    public static void printPath(Position[] path) {
        System.out.println("Path:");
        // TODO
        // Path: (0,0) (0,1) (1,1) (1,2) (1,3) (2,3) (2,4) (3,4) (4,4) (4,3) (4,2) (5,2) (6,2) (6,3) (6,4) (6,5) (6,6)


    }

    public static Position[] randomPathGenerator() {
        Position[] path = new Position[10];
        path[0] = new Position(0, 0, 'X');
        for (int i = 1; i < 10; i++) {
            path[i] = new Position(i - 1, i, 'X');
            path[i].parent = path[i - 1];
        }

        return path;

    }

    public static void printMaze(char[][] maze) {
        System.out.println("Maze: ");
        if (maze == null || maze[0] == null) {
            System.err.println("*** Invalid maze array");
            return;
        }
        // TODO
        /*
        0 0 1 0 0 0 0
        0 0 0 0 1 1 0
        0 1 1 0 0 1 0
        0 1 1 1 0 1 1
        0 1 0 0 0 0 0
        1 1 0 1 1 1 1
        0 0 0 0 0 0 0
        */
        /*
        X X 1 . . . .
        0 X X X 1 1 .
        0 1 1 X X 1 .
        0 1 1 1 X 1 1
        0 1 X X X . .
        1 1 X 1 1 1 1
        0 0 X X X X X
         */
        System.out.println();
    }

    public static char[][] readMaze(String filename) throws IOException {
        char [][] maze;
        Scanner scanner;
        try{
            scanner = new Scanner(new FileInputStream(filename));
        }
        catch(IOException ex){
            System.err.println("*** Invalid filename: " + filename);
            return null;
        }

        int N = scanner.nextInt();
        scanner.nextLine();
        maze = new char[N][N];
        int i=0;
        while(i < N && scanner.hasNext()){
            String line =  scanner.nextLine();
            String [] tokens = line.split("\\s+");
            int j = 0;
            for (; j< tokens.length; j++){
                maze[i][j] = tokens[j].charAt(0);
            }
            if(j!=N){
                System.err.println("*** Invalid line: " + i + " has wrong # columns: " + j);
                return null;
            }
            i++;
        }
        if(i!=N){
            System.err.println("*** Invalid file: has wrong number of rows: " + i);
            return null;
        }
        return maze;


        }

    // main method: reads in maze file and finds path using both stackSearch and queueSearch
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("***Usage: java PathFinder maze_file");
            System.exit(-1);
        }
        String mazePath = args[0];
//        String mazePath = "src/cs171/sum2023/lab7/A3/maze2.txt";
        char[][] maze;
        Position[] randomPath = randomPathGenerator();
        printPath(randomPath);
        maze = readMaze(mazePath);
        printMaze(maze);

        Position [] path = stackSearch(maze);
        if( path == null ){
            System.out.println("Maze is NOT solvable (no valid path identified in stackSearch).");
        } else {
            System.out.println("stackSearch Solution:");
            printPath(path);
            printMaze(maze);
        }


    }

    public static Position[] stackSearch(char[][] maze) {
        //initialize the stack
        //push maze (0, 0) to stack
        //while loop on stack{
        //check the point if is, Exit, path, etc. Mark it as visited('.') or path ('X')

        //add neighbors to the stack bottom, right, top, left


        //while loop

        return null;
    }

}
