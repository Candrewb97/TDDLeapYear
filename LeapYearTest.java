import org.junit.Assert;
import org.junit.Test;

public class LeapYearTest {

    @Test(expected = RuntimeException.class)
    public void whenMoreThanFourNumbersAreUsedThenAnExceptionIsThrown() {
        LeapYear.isLeapYear("12345");
    }
    @Test
    public void yearShouldBeDivisbleByFourAndDivisibleBy100And400() {
        Assert.assertEquals(true, LeapYear.isLeapYear("1996"));
        Assert.assertEquals(false, LeapYear.isLeapYear("2001"));
        Assert.assertEquals(true, LeapYear.isLeapYear("2000"));
        Assert.assertEquals(false, LeapYear.isLeapYear("1900"));
    }
}