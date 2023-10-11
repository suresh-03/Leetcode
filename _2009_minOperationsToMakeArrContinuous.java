import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class _2009_minOperationsToMakeArrContinuous {
    public int minOperations(int[] nums) {
        int len = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int ans = len;
        int right = 0;

        for(int left = 0; left < list.size(); left++){
            while(right < list.size() && list.get(right) < list.get(left) + len){
                right++;
            }
            ans = Math.min(ans,len - (right - left));
        }
        return ans;
    }
}
