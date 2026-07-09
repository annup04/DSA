import java.util.*;

public static class Solution {
    public int largestelementarr(int[] nums) {
        // Seed with the first element, not 0, so negatives work
        int largest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        return largest;
    }
}

public static void main(String args[]) {
    Solution obj = new Solution();
    int[] nums = { 3, 9, 5 };
    // int [] nums2={-5,-2-9};
    System.out.println(obj.largestelementarr(nums 4));

}