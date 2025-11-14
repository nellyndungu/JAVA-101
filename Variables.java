public class Variables {
    public static void main(String [] args){
        // Declaring (Creating) variables
        // Data type: int
        int date = 13;
        int month = 11;
        int year = 2025;

        // String type: String and text surrounded by double quotes
        String day = "Thursday";

        // Character Type: single character with single quote
        char stk = '/';

        // Final type: The value assigned remains unchanged throughout
        final int century = 20;

        // Print century, day and date
        System.out.println("Century: " + century + "th");
        System.out.println(day);
        // Data type identifies: %d for integers and %s for string and character.
        System.out.printf("%d%s%d%s%d",date,stk,month,stk,year);
    }
}