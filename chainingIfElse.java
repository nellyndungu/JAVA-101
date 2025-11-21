import java.util.Scanner;
public class chainingIfElse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // No of days in any month of the year
        int year, month;
        //Prompt and get user input
        System.out.println("Enter the year:");
        year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the month (up to 12):");
        month = scanner.nextInt();
        daysInMonth(month, year);


    }
    public static void daysInMonth(int month, int year){
        //Print No of days
        if(month == 4 || month == 6 || month == 9){
            System.out.println("30 days");
        }else if(month == 2){
            if(year%4 == 0){
                System.out.println("29 days");
            }else{
                System.out.println("28 days");
            }
        }else{
            System.out.println("31 days");
        }
    }
}
