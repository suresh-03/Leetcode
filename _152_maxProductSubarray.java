public class _152_maxProductSubarray {
    class Solution {
        public int maxProduct(int[] nums) {
            // int max = -10;
    
            // for(int i = 0; i < nums.length; i++){
            //     int prod = 1;
            //     for(int j = i; j < nums.length; j++){
            //         prod *= nums[j];
            //         max = Math.max(max,prod); 
            //     }
            // }
            // return max;
            int prod = 1;
            int max = -10;
    
            for(int i = 0; i < nums.length; i++){
                prod *= nums[i];
                max = Math.max(prod,max);
                if(prod == 0) prod = 1;
            }
            prod = 1;
             for(int i = nums.length-1; i >= 0; i--){
                prod *= nums[i];
                max = Math.max(prod,max);
                if(prod == 0) prod = 1;
            }
            return max;
        }
    }
}
