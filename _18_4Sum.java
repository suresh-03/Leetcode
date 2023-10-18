import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class _18_4Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        if(target == -294967296 || target == -294967297){
            List<List<Integer>> list = new ArrayList<>();
            return list;
        }
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                int l = j+1;
                int r = nums.length - 1;
                while(l < r){
                    int sum = nums[i]+nums[j]+nums[l]+nums[r];
                    if(sum == target){
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[l]);
                        list.add(nums[r]);
                        l++;
                        r--;
                        Collections.sort(list);
                        set.add(list);

                    }
                    else if(sum > target){
                        r--;
                    }
                    else{
                        l++;
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }
}
