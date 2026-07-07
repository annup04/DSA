import java.util.*;

public class averageofarrelement {
    public static class Solution{
        public double arrayAverage(int[] nums) {
            // Accumulate in a long to avoid overflow
            long sum = 0;
            for (int num : nums) {
                sum += num;
            }
            // Cast to double before dividing to keep the fraction
            return (double) sum / nums.length;
        }
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = { 2, 4, 6 };
        System.out.println(obj.arrayAverage(nums));

    }
}
