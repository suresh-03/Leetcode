public class _1004_maxConsecutiveOnesIII {

        public int longestOnes(int[] nums, int k) {
            int right = 0;
            int left = 0;
            int one = 0;
            int ans = 0;
    
            for(;right < nums.length; right++){
                if(nums[right] == 1){
                    one++;
                }
                while((right - left + 1) - one > k){
                    if(nums[left] == 1){
                        one--;
                    }
                    left++;
                }
                ans = Math.max(ans,right - left + 1);
            }
            return ans;
        }
    }

