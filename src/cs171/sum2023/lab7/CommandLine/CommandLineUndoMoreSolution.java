package cs171.sum2023.lab7.CommandLine;
import cs171.sum2023.lab7.Undo.UndoMoreSolution;
//java CommandLineSimple add 5 subtract 2 multiply 2 divide 2 undo 0 undo 0
public class CommandLineUndoMoreSolution {
    private static UndoMoreSolution UndoMoreSolution = new UndoMoreSolution();

    public static void main(String[] args) {
        System.out.println("You have entered " + args.length + " command line arguments");

        for (int i = 0; i < args.length; i += 2) {
            String operation = args[i];
            int value = Integer.parseInt(args[i+1]);

            switch (operation) {
                case "add":
                    UndoMoreSolution.add(value);
                    break;
                case "subtract":
                    UndoMoreSolution.subtract(value);
                    break;
                case "multiply":
                    UndoMoreSolution.multiply(value);
                    break;
                case "divide":
                    if (value != 0) {
                        UndoMoreSolution.divide(value);
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                    break;
                case "undo":
                    UndoMoreSolution.undo();
                    break;
                default:
                    System.out.println("Invalid operation: " + operation);
                    break;
            }
            System.out.println("Current value: " + UndoMoreSolution.current());
        }
    }
}
