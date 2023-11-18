import java.util.Arrays;

public class _1838_frequencyOfMostFreqElement {
    class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 1;
        int left = 0;
        int sum = 0;

        for(int right = 0; right < nums.length; right++){
            sum += nums[right];
            while((right-left+1)*nums[right]-sum > k){
                sum -= nums[left++];
            }
            ans = Math.max(ans,right-left+1);
        }
        return ans;


    }
}
}
