public class arraysData{
    public static void main (String[] args){

        // Storing multiple values in one variable
        int [] grades = {87, 79, 90, 65, 78, 65};

        // Convert array to string
        String gradesArray = java.util.Arrays.toString(grades);


        System.out.printf("Grades: %s", gradesArray);
        // Print using index
        System.out.printf("\nHighest grade: %s", grades[2]);


    }
}
