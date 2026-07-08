import java.util.Arrays;    // Import Arrays class

public class countEvenOdd {     // Main class

    // Method to count even and odd numbers
    public static int[] countEvenOdd(int[] nums) {

        int evenCount = 0;   // Store even count
        int oddCount = 0;    // Store odd count

        // Traverse the array
        for (int x : nums) {

            // Check if number is even
            if (x % 2 == 0) {
                evenCount++;     // Increase even count
            } else {
                oddCount++;      // Increase odd count
            }
        }

        // Return both counts as an array
        return new int[]{evenCount, oddCount};
    }

    // Main method
    public static void main(String[] args) {

        // Declare and initialize the array
        int[] nums = {2, 5, 8, 11, 14, 17, 20};

        // Call the method
        int[] result = countEvenOdd(nums);

        // Display the array
        System.out.println("Array: " + Arrays.toString(nums));

        // Display even count
        System.out.println("Even Count = " + result[0]);

        // Display odd count
        System.out.println("Odd Count = " + result[1]);
    }
}