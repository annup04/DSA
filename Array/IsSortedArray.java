public class IsSortedArray {   // Main class

    // Method to check whether array is sorted or not
    public static boolean isSorted(int[] nums) {

        // Check each element with the next element
        for (int i = 0; i + 1 < nums.length; i++) {

            // If current element is greater than next element, array is not sorted
            if (nums[i] > nums[i + 1]) {

                // Return false because array is not in increasing order
                return false;
            }
        }

        // Return true if all elements are in sorted order
        return true;
    }

    // Main method where execution starts
    public static void main(String[] args) {

        // Create an array
        int[] nums = {1, 2, 3, 4, 5};

        // Call method and store result
        boolean result = isSorted(nums);

        // Print result
        System.out.println("Array is sorted: " + result);
    }
}
