import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class RecursiveBinarySearchTest {

    
    @Test
    void testBinarySearchInteger_Found() {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15};
        assertEquals(3, RecursiveBinarySearch.binarySearch(array, 7));
    }

    @Test
    void testBinarySearchInteger_NotFound() {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15};
        assertEquals(-1, RecursiveBinarySearch.binarySearch(array, 2));
    }

    @Test
    void testBinarySearchInteger_EmptyArray() {
        int[] array = {};
        assertEquals(-1, RecursiveBinarySearch.binarySearch(array, 7));
    }

    @Test
    void testBinarySearchInteger_NullArray() {
        int[] array = null;
        assertEquals(-1, RecursiveBinarySearch.binarySearch(array, 7));
    }

    @Test
    void testBinarySearchInteger_SingleElementFound() {
        int[] array = {7};
        assertEquals(0, RecursiveBinarySearch.binarySearch(array, 7));
    }

    @Test
    void testBinarySearchInteger_SingleElementNotFound() {
        int[] array = {7};
        assertEquals(-1, RecursiveBinarySearch.binarySearch(array, 3));
    }

    // Test for binary search with strings
    @Test
    void testBinarySearchString_Found() {
        String[] array = {"apple", "banana", "cherry", "date", "fig"};
        assertEquals(2, RecursiveBinarySearch.binarySearch(array, "cherry"));
    }

    @Test
    void testBinarySearchString_NotFound() {
        String[] array = {"apple", "banana", "cherry", "date", "fig"};
        assertEquals(-1, RecursiveBinarySearch.binarySearch(array, "grape"));
    }

    @Test
    void testBinarySearchString_EmptyArray() {
        String[] array = {};
        assertEquals(-1, RecursiveBinarySearch.binarySearch(array, "cherry"));
    }

    @Test
    void testBinarySearchString_NullArray() {
        String[] array = null;
        assertEquals(-1, RecursiveBinarySearch.binarySearch(array, "cherry"));
    }

    @Test
    void testBinarySearchString_SingleElementFound() {
        String[] array = {"cherry"};
        assertEquals(0, RecursiveBinarySearch.binarySearch(array, "cherry"));
    }

    @Test
    void testBinarySearchString_SingleElementNotFound() {
        String[] array = {"cherry"};
        assertEquals(-1, RecursiveBinarySearch.binarySearch(array, "apple"));
    }


    @Test
    void testBinarySearchAllIndices_NotFound() {
        int[] array = {1, 3, 3, 3, 5, 7};
        List<Integer> result = RecursiveBinarySearch.binarySearchAllIndices(array, 6);
        assertTrue(result.isEmpty());
    }

    @Test
    void testBinarySearchAllIndices_SingleOccurrence() {
        int[] array = {1, 3, 3, 3, 5, 7};
        List<Integer> result = RecursiveBinarySearch.binarySearchAllIndices(array, 5);
        assertEquals(Arrays.asList(4), result);
    }

    @Test
    void testBinarySearchAllIndices_EmptyArray() {
        int[] array = {};
        List<Integer> result = RecursiveBinarySearch.binarySearchAllIndices(array, 5);
        assertTrue(result.isEmpty());
    }

    @Test
    void testBinarySearchAllIndices_NullArray() {
        int[] array = null;
        List<Integer> result = RecursiveBinarySearch.binarySearchAllIndices(array, 5);
        assertTrue(result.isEmpty());
    }


    @Test
    void testBinarySearchAllIndices_NoMatchingValues() {
        int[] array = {3, 3, 3, 3, 3};
        List<Integer> result = RecursiveBinarySearch.binarySearchAllIndices(array, 7);
        assertTrue(result.isEmpty());
    }
}
