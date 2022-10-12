/*
* This is the standard Main() class starting point.
*
* @author  Daria Bernice Calitis
* @version 11.0.16
* @since   2022-10-03
*/

// Imports
import java.util.Scanner;

/**
*  Main class.
*/
final class Main {
    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        // Declaring classes.
        final Scanner scan = new Scanner(System.in);
        final MrCoxallStack stack = new MrCoxallStack();

        System.out.print("Enter a number: ");
        final int userNum1 = scan.nextInt();
        stack.pushItem(userNum1);

        System.out.print("Enter a second number: ");
        final int userNum2 = scan.nextInt();
        stack.pushItem(userNum2);

        System.out.print("Enter a third number: ");
        final int userNum3 = scan.nextInt();
        stack.pushItem(userNum3);

        System.out.println(stack.getStack());

        System.out.printf("\nPopped number: %d\n", stack.popItem());
        System.out.println(stack.getStack());

        System.out.println("\nDone.");
    }
}

