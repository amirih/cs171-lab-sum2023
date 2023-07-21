package cs171.sum2023.lab7.CommandLine;

public class CommandLineSimple {
    public static void main(String[] args) {
        System.out.println("You have entered " + args.length + " command line arguments");

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
    }
}
