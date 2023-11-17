import java.util.Arrays;

public class _1877_minimizeMaxPairSumInArray {
    class Solution {
    public int minPairSum(int[] nums) {
        int max = 0;
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        while(i < j){
            max = Math.max(max,(nums[i]+nums[j]));
            i++;
            j--;
        }
        return max;
    }
}
}
