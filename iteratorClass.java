// Import iterator
import java.util.Iterator;
//import java.util.List;
import java.util.ArrayList;
//import java.util.ListIterator;
public class iteratorClass {
    public static void main(String[] args){
        // Add array elements into the arraylist
        int [] numbers = {23, 45, 65, 79, 10};
        ArrayList<Integer> prices = new ArrayList<>();
                for (int i : numbers){
                    prices.add(i);
                }
        // Java iterators - collection object that can loop through collection classes.
        // Declare an iterator
        Iterator<Integer> print = prices.iterator();

        // Get first element
        // The next() method return the first element.
        System.out.println(print.next());

        // Looping  through an entire list.
        // The hasNext() method returns a boolean value
        do {
            System.out.println(print.next());
        } while (print.hasNext());

    }

}
