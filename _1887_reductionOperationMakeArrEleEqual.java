import java.util.Arrays;

public class _1887_reductionOperationMakeArrEleEqual {
    class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        if(nums[nums.length-1] == 1) return 0;
        if(nums.length == 1) return 0;
  
        int count = 0;
        for(int i = nums.length-1; i > 0; i--){
            if(nums[i] > nums[i-1]){
                count += (nums.length-i);
            }
        }
        return count ;
    }
}
}
