public class LeapYear {

    public static boolean isLeapYear(String year) {
        boolean leapYr = false;
        int yearInt = Integer.parseInt(year);
        if (year.length() > 4) {
            throw new RuntimeException("Year can not be longer than 4 digits!");
        } else {
            
            if (isDivisibleBy4(yearInt) && !isDivisibleBy100(yearInt)) {
                leapYr = true;
            }  
            else if (isDivisibleBy100(yearInt) && isDivisibleBy400(yearInt)) {
                leapYr = true;
            } 
            else {
                leapYr = false;
            }
        }
        return leapYr;
    }

    // checks if yearInt is divisble by 4
    private static boolean isDivisibleBy4(int yearInt) {
        return yearInt % 4 == 0;
    }

    // checks if yearInt is divisble by 100
    private static boolean isDivisibleBy100(int yearInt) {
        return yearInt % 100 == 0;
    }

    // checks if yearInt is divisble by 400
    private static boolean isDivisibleBy400(int yearInt) {
        return yearInt % 400 == 0;
    }
}