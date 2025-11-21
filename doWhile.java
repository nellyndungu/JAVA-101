import java.util.Scanner;
public class doWhile {
    public static void main(String[] args){
        // Menu program
        Scanner scanner = new Scanner(System.in);
        int menuChoice;
        double balance = 200.0;
        do{
            System.out.println("Service Menu");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("Enter Choice (Number)");
            menuChoice = scanner.nextInt();
            //Handle the customer choices
            switch (menuChoice){
                case 1:
                    System.out.println("Your Balance: "+ balance);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit:");
                    double deposit = scanner.nextDouble();
                    balance += deposit;
                    System.out.println("Deposit Successful. New balance: " + balance);
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw");
                    double withdraw = scanner.nextDouble();
                    if(withdraw > balance){
                        System.out.println("Not enough balance -> "+ balance);
                    }else{
                        balance -= withdraw;
                        System.out.println("Withdrawal successful. New balance: " + balance);
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }while(menuChoice !=4 );
    }
}
