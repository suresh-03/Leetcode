import java.util.HashMap;

public class _1814_countNicePairsInArray {
    class Solution {
        public int countNicePairs(int[] nums) {
            long count = 0;
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i = 0; i < nums.length; i++){
              nums[i] = nums[i]-rev(nums[i]);
            }
            for(int i = 0; i < nums.length; i++){
                if(map.containsKey(nums[i])){
                    count += map.get(nums[i]);
                    map.put(nums[i],map.get(nums[i])+1);
                }
                else{
                    map.put(nums[i],1);
                }
            }
            return (int)(count % (Math.pow(10,9)+7));
        }
        public int rev(int n){
            int ans = 0;
            while(n != 0){
                int mod = n % 10;
                ans = ans * 10 + mod;
                n /= 10;
            }
            return ans;
        }
    }
}
