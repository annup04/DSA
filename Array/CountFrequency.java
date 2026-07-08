import java.util.*;   // Import List and ArrayList classes

public class CountFrequency {   // Main class

    // Method to count frequency of each element in the array
    public static int[][] countFrequency(int[] nums) {

        // Create a list to store value and its frequency
        List<int[]> rows = new ArrayList<>();

        // Traverse each element of the array
        for (int i = 0; i < nums.length; i++) {

            // Check if current value was already counted before
            boolean seen = false;

            // Compare current value with previous elements
            for (int j = 0; j < i; j++) {

                // If value is already present, mark it as seen
                if (nums[j] == nums[i]) {

                    seen = true;   // Value already counted

                    break;   // Stop checking
                }
            }

            // Skip this value if it was already counted
            if (seen) {
                continue;
            }

            // Variable to store frequency count
            int count = 0;

            // Count occurrences of current value
            for (int k = i; k < nums.length; k++) {

                // If value matches, increase count
                if (nums[k] == nums[i]) {
                    count++;
                }
            }

            // Add value and count as a row
            rows.add(new int[]{nums[i], count});
        }

        // Convert List<int[]> into int[][] and return
        return rows.toArray(new int[0][]);
    }


    // Main method - execution starts here
    public static void main(String[] args) {

        // Create input array
        int[] nums = {1, 2, 2, 3, 1, 4, 2};

        // Call frequency method
        int[][] result = countFrequency(nums);

        // Print result
        for (int[] row : result) {

            // Print number and its frequency
            System.out.println("Number: " + row[0] + " Frequency: " + row[1]);
        }
    }
}
