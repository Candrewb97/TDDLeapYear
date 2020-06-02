import org.junit.Assert;
import org.junit.Test;


public class LeapYearTest {
    
    @Test(expected = RuntimeException.class)

    public void whenMoreThanFourNumbersAreUsedThenAnExceptionIsThrown() {
        LeapYear.isLeapYear("12345");
    }


        
    
}