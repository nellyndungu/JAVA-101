// Include Java util package in order to use scanner class
import java.util.Scanner;

public class Operations {
    public static void main(String [] args){
        // Create 'Scanner' object to read input and initialize it
        Scanner scanner = new Scanner(System.in);

        // Define Variables
        int threshold = 100;
        String name = "Level";

        // Prompt and get user inputs
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter a string: ");
        String userInput = scanner.nextLine();

        //Boolean Operators: Equal to and Not Equal to
        boolean isEqual = (count == threshold);
            System.out.println("Is not Equal to threshold?: " + isEqual);
        boolean isNotEqual = (count != threshold);
            System.out.println("Is not Equal to threshold?: " + isNotEqual);
            System.out.println("Is user input equal?: " + userInput.equals(name));

        // Less than and Greater than Operators
        boolean isGreater = (count > threshold);
        boolean isLess = (count < threshold);
            System.out.println("Is Less than Threshold?: " + isLess);
            System.out.println("Is Greater than Threshold?: " + isGreater);

        // Greater than or equal to Operator
            System.out.println("Count is greater than or equal to threshold?: " + (count >= threshold));
        // Less than or equal to
            System.out.println("Count is less than or equal to threshold?: " + (count <= threshold));

        // Logical Operators
        // Logic OR
        boolean greaterEqual = (isEqual || isGreater) ;
        System.out.println("Count is greater than or equal to threshold?: " + greaterEqual);
        // Logical AND
        boolean andLogic = ((count > 0) && isLess);
        System.out.println("Count is greater than zero and less than threshold?: " + andLogic);
    }
}

