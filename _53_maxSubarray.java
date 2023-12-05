public class _53_maxSubarray{
    class Solution {
        public int maxSubArray(int[] nums) {
            int left = 0;
            int max = Integer.MIN_VALUE;
            int sum = 0;
            
            for(int right = 0; right < nums.length; right++){
               sum += nums[right];
               while(sum < nums[right]){
                   sum -= nums[left++];
                   
               }
                   max = Math.max(max,sum);
                   System.out.println(sum);
               
    
               }
               
            
           return max;
        }
    }
    // referred code
      class Solution2 {
        public int maxSubArray(int[] nums) {
            int max = Integer.MIN_VALUE;
            int sum = 0;
            
            for(int right = 0; right < nums.length; right++){
                    sum = Math.max(nums[right],(sum += nums[right]));
                   max = Math.max(max,sum);
                   System.out.println(sum);
               
    
               }
               
            
           return max;
        }
    }
}