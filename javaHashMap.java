// Import java.util package and use hashmap interface
import java.util.HashMap;
import java.util.Scanner;

public class javaHashMap {
    public static void main(String[] args){
        // Email generator
        // Create a hashmap
        HashMap<String, String> userName = new HashMap<>();
        // Prompt user for username
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String name = scanner.nextLine();

        //Automatically generate the email
        String userEmail = name+ "@gmail.com";

        // Add the username
        userName.put(name, userEmail);
        System.out.println(userName);
        // print out just the email
        System.out.println("\nGenerated Email: " + userName.get(name));
    }
}
