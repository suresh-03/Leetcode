import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1630_arithmeticSubarrays {
    class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        for(int i = 0; i < l.length; i++){
            int ind = 0;
            int[] temp = new int[r[i]-l[i]+1];
            for(int j = l[i]; j <= r[i]; j++){
                temp[ind] = nums[j];
                ind++;
            }
            Arrays.sort(temp);
            boolean arithmatic = true;
            int diff = temp[1]-temp[0];
            for(int k = 1; k < temp.length-1; k++){
                if(temp[k+1]-temp[k] != diff){
                    arithmatic = false;
                }
            }
            if(arithmatic){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}
}
