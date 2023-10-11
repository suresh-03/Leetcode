import java.util.HashSet;

public class _1695_maxErasureValue {
      public int maximumUniqueSubarray(int[] nums) {
        int right = 0;
        int left = 0;
        int sum  = 0;
        int ans = 0;

        HashSet<Integer> set = new HashSet<>();

        for(;right < nums.length; right++){
            sum += nums[right];
            while(set.contains(nums[right]))    
            {
                set.remove(nums[left]);
                sum -= nums[left++];
            }
            if(!set.contains(nums[right])) set.add(nums[right]);
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}
