import java.util.ArrayList;
import java.util.List;

public class RecursiveBinarySearch {

    // Specification: Searches for a target value in a sorted array using recursion
    // Returns the index of the target if found, otherwise returns -1
    public static int binarySearchRecursive(int[] array, int target, int left, int right) {
        // Base case: when the search range is invalid
        if (left > right) {
            return -1;
        }
        
        int mid = left + (right - left) / 2; // Avoid overflow

        // Check if the middle element is the target
        if (array[mid] == target) {
            return mid;
        }
        // Recursively search in the left or right half
        if (target < array[mid]) {
            return binarySearchRecursive(array, target, left, mid - 1);
        } else {
            return binarySearchRecursive(array, target, mid + 1, right);
        }
    }

    // Overloaded method for array input and initialization
    public static int binarySearch(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1; // Error handling for null or empty array
        }
        return binarySearchRecursive(array, target, 0, array.length - 1);
    }

    // Mandatory Enhancement 1: Binary search for arrays of strings
    public static int binarySearch(String[] array, String target) {
        if (array == null || array.length == 0) {
            return -1;
        }
        return binarySearchRecursive(array, target, 0, array.length - 1);
    }

    private static int binarySearchRecursive(String[] array, String target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (array[mid].equals(target)) {
            return mid;
        }
        if (target.compareTo(array[mid]) < 0) {
            return binarySearchRecursive(array, target, left, mid - 1);
        } else {
            return binarySearchRecursive(array, target, mid + 1, right);
        }
    }

    // Mandatory Enhancement 2: Return all indices of a target value
    public static List<Integer> binarySearchAllIndices(int[] array, int target) {
        List<Integer> indices = new ArrayList<>();
        if (array == null) { // Add null check
            return indices; // Return an empty list if the array is null
        }
        binarySearchAllRecursive(array, target, 0, array.length - 1, indices);
        return indices;
    }

    private static void binarySearchAllRecursive(int[] array, int target, int left, int right, List<Integer> indices) {
        if (left > right) {
            return;
        }

        int mid = left + (right - left) / 2;

        if (array[mid] == target) {
            indices.add(mid);
            binarySearchAllRecursive(array, target, left, mid - 1, indices); // Search left
            binarySearchAllRecursive(array, target, mid + 1, right, indices); // Search right
        } else if (target < array[mid]) {
            binarySearchAllRecursive(array, target, left, mid - 1, indices);
        } else {
            binarySearchAllRecursive(array, target, mid + 1, right, indices);
        }
    }

  
}
