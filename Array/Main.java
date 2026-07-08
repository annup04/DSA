
// Import statement 
import java.util.*;

// Main class
public class Main {

    // Method to move all zeroes to the end
    public static void Movezeroesarr(int[] nums) {

        // Stores the index where the next non-zero element should be placed
        int insertPos = 0;

        // Traverse the array
        for (int num : nums) {

            // Check if the current element is not zero
            if (num != 0) {

                // Place the non-zero element at the insert position
                nums[insertPos] = num;

                // Move to the next insert position
                insertPos++;
            }
        }

        // Fill the remaining positions with zeroes
        while (insertPos < nums.length) {

            // Place zero
            nums[insertPos] = 0;

            // Move to the next index
            insertPos++;
        }
    }

    // Main method - program execution starts here
    public static void main(String[] args) {

        // Create an input array
        int[] nums = { 0, 1, 0, 3, 12 };

        // Call the method
        Movezeroesarr(nums);

        // Print the updated array
        System.out.println(Arrays.toString(nums));
    }
}