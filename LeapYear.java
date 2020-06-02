public class LeapYear {

     public static boolean isLeapYear(String year) {
        if (year.length() > 4) {
            throw new RuntimeException("Year can not be longer than 4 digits!");
     }
     return true;
    }
}
