public class _1464_maxProductOf2ElementsInArray {
    class Solution {
        public int maxProduct(int[] nums) {
            int max = 0;
            for(int i = 0; i < nums.length-1; i++){
                for(int j = i+1; j < nums.length; j++){
                    int num = (nums[i]-1)*(nums[j]-1);
                    max = Math.max(num,max);
                }
            }
            return max;
        }
    }
}
