import java.util.ArrayList;
import java.util.Arrays;

public class _16_3SumClosest {
    class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length == 3){
            int ans = 0;
            for(int i = 0; i < nums.length; i++){
                ans += nums[i];
            }
            return ans;
        }
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
          int j = 0;
          int k = nums.length-1;
          while(j < nums.length && k >= 0 && j < k){
              if(j == i){
                  j++;
                  continue;
              }
              if(k == i){
                  k--;
                  continue;
              }
              int sum = nums[i]+nums[j]+nums[k];
              if(sum < target){
                  list.add(sum);
                  j++;
              }
              else if(sum > target){
                  list.add(sum);
                  k--;
              }
              else{
                  list.add(sum);
                  j++;
                  k--;
              }
          }
        }
        // System.out.println(list);
        int min = (int)Math.abs(list.get(0)-target);
        int index = 0;
        for(int i = 1; i < list.size(); i++){
            if((int)Math.abs(list.get(i)-target) < min){
                index = i;
                min = (int)Math.abs(list.get(i)-target);
            }
        }
        return list.get(index);
    }
}
}
