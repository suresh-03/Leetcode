public class _643_maxAvgSubarrayI {
    class Solution {
        public double findMaxAverage(int[] nums, int k) {
            int right = 0;
            int left = 0;
            double ans = Integer.MIN_VALUE;
            double avg = 0;
            for(;right < nums.length; right++){
                avg += nums[right];
              
                if((right-left+1) > k){
                    avg -= nums[left++];
                }
                  if((right-left+1) == k){
                    ans = Math.max(ans,(avg/k));
                }
    
            }
            return ans;
        }
    }
}
