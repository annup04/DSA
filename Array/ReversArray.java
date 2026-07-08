import java.util.Arrays;   // Import Arrays class

public class ReversArray {   // Main class

    // Method to reverse an array
    public static int[] reverseArray(int[] nums) {

        int left = 0;   // Starting index
        int right = nums.length - 1;   // Ending index

        // Swap elements until pointers meet
        while (left < right) {

            int temp = nums[left];   // Store left value temporarily

            nums[left] = nums[right];   // Put right value at left position

            nums[right] = temp;   // Put stored value at right position

            left++;   // Move left pointer forward

            right--;   // Move right pointer backward
        }

        return nums;   // Return reversed array
    }

    // Main method
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};   // Create array

        int[] result = reverseArray(nums);   // Call reverse method

        System.out.println(Arrays.toString(result));   // Print reversed array
    }
}
