public class _1493_longSubArr1Deleting1ele {
    public int longestSubarray(int[] nums) {
        int right = 0;
        int left = 0;
        int ans = 0;
        int zeros = 0;

        for(;right < nums.length; right++){
            if(nums[right] == 0) zeros++;

            while(zeros > 1){
                if(nums[left] == 0){
                    zeros--;
                }
                left++;
            }
            ans = Math.max(ans,(right - left));
        }
        return ans;
}
}
