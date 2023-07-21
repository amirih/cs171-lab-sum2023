package cs171.sum2023.lab7.CommandLine;
import cs171.sum2023.lab7.Undo.UndoMoreSolution;

//java CommandLineSimple add 5 subtract 2 multiply 2 divide 2 undo 0 undo 0
public class CommandLineUndoMoreStarter {
    private static UndoMoreSolution UndoMoreSolution = new UndoMoreSolution();

    public static void main(String[] args) {
        System.out.println("You have entered " + args.length + " command line arguments");

      // don't forget to check for divide by zero
    }
}
