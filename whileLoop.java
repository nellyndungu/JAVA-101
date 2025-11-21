import java.util.Scanner;
public class whileLoop {
    public static void main(String [] args){
        // Rocket Count down Loop
        Scanner scanner = new Scanner(System.in);

        // Prompt user for rocket count down
        System.out.println("Enter Starting Point:");
        int countDown = scanner.nextInt();
        while(countDown > 0 ){
            System.out.println(countDown);
            // Introduce delay
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            countDown--;
        }
    }
}
