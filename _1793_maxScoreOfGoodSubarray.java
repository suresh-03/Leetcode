public class _1793_maxScoreOfGoodSubarray{
    public int maximumScore(int[] nums, int k) {
        int j = k,i = k;
        int min = nums[k];
        int ans = min;

        while(i > 0 || j < nums.length - 1){
            if(i == 0 || j < nums.length-1 && nums[j+1] > nums[i-1]){
                j++;
            }
            else{
                i--;
            }
            min = Math.min(min,Math.min(nums[i],nums[j]));
            ans = Math.max(ans,min*(j-i+1));
        }
        return ans;
    }
}