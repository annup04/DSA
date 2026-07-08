import java.util.*;   // Import utility classes

public class LinearSearch {   // Main class

    // Method to find target element using linear search
    public static int linearSearch(int[] nums, int target) {

        // Check every element from left to right
        for (int i = 0; i < nums.length; i++) {

            // Check if current element matches target
            if (nums[i] == target) {

                // Return index where target is found
                return i;
            }
        }

        // Return -1 if target is not found
        return -1;
    }

    // Main method where execution starts
    public static void main(String[] args) {

        // Create an array
        int[] nums = {10, 25, 7, 40, 15};

        // Target value to search
        int target = 40;

        // Call linear search method
        int result = linearSearch(nums, target);

        // Print result
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found");
        }
    }
}
