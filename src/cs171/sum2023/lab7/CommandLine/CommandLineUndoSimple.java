package cs171.sum2023.lab7.CommandLine;

import cs171.sum2023.lab7.Undo.UndoSimple;
//java CommandLineSimple add 5 subtract 2 undo 0 undo 0
public class CommandLineUndoSimple {
    private static UndoSimple UndoSimple = new UndoSimple();

    public static void main(String[] args) {
        System.out.println("You have entered " + args.length + " command line arguments");

        for (int i = 0; i < args.length; i += 2) {
            String operation = args[i];
            int value = Integer.parseInt(args[i+1]);

            switch (operation) {
                case "add":
                    UndoSimple.add(value);
                    break;
                case "subtract":
                    UndoSimple.subtract(value);
                    break;
                case "undo":
                    UndoSimple.undo();
                    break;
                default:
                    System.out.println("Invalid operation: " + operation);
                    break;
            }
            System.out.println("Current value: " + UndoSimple.current());
        }
    }
}
