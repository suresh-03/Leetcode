import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class _15_3Sum {
    class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        for(int k = 0; k < nums.length; k++){
            int s = k+1;
            int e = nums.length - 1;
            while(s<e){
                ArrayList<Integer> list = new ArrayList<>();
                if(nums[s]+nums[k]+nums[e] == 0){
                    list.add(nums[s]);
                    list.add(nums[k]);
                    list.add(nums[e]);
                    Collections.sort(list);
                    set.add(list);
                    s++;
                    e--;
                }
                else if(nums[s]+nums[k]+nums[e] > 0 ){
                    e--;
                }
                else{
                    s++;
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }
}
}
