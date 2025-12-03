// Uses inbuilt Java.util package and ArrayList function
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class arrayList {
    public static void main(String [] args){
        // Manipulating ArrayLists
        int[] numbers = {1,2,3};
        List<String> cars = new ArrayList<>();
        //Adding elements into the arrayList
        cars.add("Volvo");
        cars.add("Mazda");
        cars.add("Defender");
        System.out.println(cars);
        List<Integer> price = new ArrayList<>(numbers.length);
        // Get the array elements and add to the ArrayList
        for (int i : numbers){
            price.add(i);
        }
        //Query for the ArrayList content.
        System.out.println(price);
        // Sorting data
        Collections.sort(price);


        // Indexing ArrayList - method used is get()
        // Print individual car brand and its corresponding price
        for(int i = 0; i < numbers.length && i < cars.size(); i++){
            price.add(i);
            System.out.println(cars.get(i) + " : " + price.get(i) + " Million");
        }
    }
}
