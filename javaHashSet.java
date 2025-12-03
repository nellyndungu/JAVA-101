// Import the java.util and use HashSet interface
import  java.util.HashSet;
import java.util.Scanner;
public class javaHashSet {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        // Ask user their preferred car
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your car: ");
        String myCar = scanner.nextLine();
        cars.add("Toyota");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Hyundai");

        //Check if the user car is present.
        if(cars.contains(myCar)) {
            System.out.println("Car Available!");
        }else{
            System.out.println("Car Unavailable!");
        }
    }
}
