import java.util.HashMap;
import java.util.Map;

public class Majorelementarr {

    // Function to find the majority element
    public int majorityElement(int[] nums) {

        // Store the frequency of each number
        Map<Integer, Integer> counts = new HashMap<>();

        // Majority element must appear more than n/2 times
        int threshold = nums.length / 2;

        // Traverse the array
        for (int num : nums) {

            // Increase the count of the current number
            int count = counts.getOrDefault(num, 0) + 1;

            // Update the map
            counts.put(num, count);

            // Return if majority element is found
            if (count > threshold) {
                return num;
            }
        }

        // This line will never execute as per problem statement
        return -1;
    }

    // Main method to test the program
    public static void main(String[] args) {

        // Create an object of the current class
        Majorelementarr obj = new Majorelementarr();

        // Input array
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        // Call the function
        int result = obj.majorityElement(nums);

        // Print the majority element
        System.out.println("Majority Element: " + result);
    }
}