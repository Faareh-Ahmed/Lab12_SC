public class RecursiveSumOfDigits {

    // Calculates the sum of the digits of a number using recursion
    public static long sumOfDigits(long l) {
        if (l < 0) {
            l = Math.abs(l); // Convert to positive if the number is negative
        }
        // Base case: When the number is equal to 0
        if (l == 0) {
            return 0;
        }
        // Recursion: Add the last digit and recurse with the rest of the number
        return l % 10 + sumOfDigits(l / 10);
    }
}
