public class ArithmeticOperators {
    public static void main(String [] args){
        // Define Variables
        int a = 65, b = 7;
        //Addition
        System.out.println("Sum = "+ (a+b));
        //Subtraction
        System.out.println("Difference = "+ (a-b));
        // Multiplication
        System.out.println("Product = "+ (a*b));
        //Division
        System.out.println("Quotation = "+ (a/b));
        //Modulus -> `%` Returns the division remainder
        System.out.println("Remainder = "+ (a%b));
        // Unary Operators
        //Post-increment -> Returns the value after increment
        a++;
        System.out.println("Post-Increment (a) = "+ a);
        b++;
        System.out.println("Post-Increment (b) = "+ b);
        //Post-Decrement
        a--;
        System.out.println("Post-decrement (a) = "+ a);
        b--;
        System.out.println("Post-decrement (b) = "+ b);
        // Original Values Before increment
        ++a;
        System.out.println("Pre-Increment (a) = "+ a);
        ++b;
        System.out.println("Pre-Increment (b) = "+ b);
        //Pre-Decrement
        --a;
        System.out.println("Pre-decrement (a) = "+ a);
        --b;
        System.out.println("Pre-decrement (b) = "+ b);
    }
}
