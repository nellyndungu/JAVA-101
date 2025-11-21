import java.util.Scanner;
public class ifElse {
    public static void main(String [] args){
        // Print No of logged hours
        char suffix = 's';
        Scanner scanner = new Scanner(System.in);

        //Prompt and get user input
        System.out.println("Enter No of logged hours: ");
        int hours = scanner.nextInt();

        // Print No of hours
        if(hours == 1){
            System.out.println("Logged hours: "+ hours + " hour");
        }else{
            System.out.println("Logged hours: " + hours + " hour" + suffix);
        }
    }
}
