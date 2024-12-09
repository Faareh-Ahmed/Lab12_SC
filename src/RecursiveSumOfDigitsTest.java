import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RecursiveSumOfDigitsTest {

    @Test
    void testZero() {
        assertEquals(0, RecursiveSumOfDigits.sumOfDigits(0));
    }

    @Test
    void testSingleDigitPositive() {
        assertEquals(5, RecursiveSumOfDigits.sumOfDigits(5));
    }

    @Test
    void testSingleDigitNegative() {
        assertEquals(9, RecursiveSumOfDigits.sumOfDigits(-9));
    }

    @Test
    void testSmallPositiveNumber() {
        assertEquals(10, RecursiveSumOfDigits.sumOfDigits(1234));
    }

    @Test
    void testSmallNegativeNumber() {
        assertEquals(6, RecursiveSumOfDigits.sumOfDigits(-123));
    }

    @Test
    void testLargePositiveNumber() {
        assertEquals(45, RecursiveSumOfDigits.sumOfDigits(99999));
    }

    @Test
    void testLargeNegativeNumber() {
        assertEquals(39, RecursiveSumOfDigits.sumOfDigits(-987654));
    }

    @Test
    void testMixedDigitsPositive() {
        assertEquals(17, RecursiveSumOfDigits.sumOfDigits(8342));
    }

    @Test
    void testMixedDigitsNegative() {
        assertEquals(21, RecursiveSumOfDigits.sumOfDigits(-5673));
    }

    @Test
    void testAllZeroes() {
        assertEquals(0, RecursiveSumOfDigits.sumOfDigits(0));
    }

    @Test
    void testAlternateDigitsPositive() {
        assertEquals(20, RecursiveSumOfDigits.sumOfDigits(5050505));
    }

    @Test
    void testAlternateDigitsNegative() {
        assertEquals(19, RecursiveSumOfDigits.sumOfDigits(-606061));
    }

    @Test
    void testTrailingZeroes() {
        assertEquals(1, RecursiveSumOfDigits.sumOfDigits(1000));
    }

    @Test
    void testMultipleZeroesBetweenDigits() {
        assertEquals(8, RecursiveSumOfDigits.sumOfDigits(40004));
    }

    @Test
    void testLargeNumberWithMixedDigits() {
        assertEquals(35, RecursiveSumOfDigits.sumOfDigits(5678234));
    }

    @Test
    void testNegativeNumberWithTrailingZeroes() {
        assertEquals(10, RecursiveSumOfDigits.sumOfDigits(-505000));
    }

    @Test
    void testNumberWithAlternatingHighAndLowDigits() {
        assertEquals(31, RecursiveSumOfDigits.sumOfDigits(8081842));
    }

    @Test
    void testVeryLargeNumber() {
        assertEquals(9, RecursiveSumOfDigits.sumOfDigits(900000000000000000L));
    }
}
