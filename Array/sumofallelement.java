import java.util.*;
class Solution {
    public long arraySum(int[] nums) {
        // Wide accumulator so the total cannot overflow
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) {
        Solution obj=new Solution();
        int [] nums={3,9,5};
        System.out.println(obj.arraySum(nums));

    }
}
