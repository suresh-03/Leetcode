import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class _2215_findDiffOfTwoArrays {
    class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++){
            boolean match = false;
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    match = true;
                }
            }
            if(!match){
                set1.add(nums1[i]);
            }
        }
        for(int i = 0; i < nums2.length; i++){
            boolean match = false;
            for(int j = 0; j < nums1.length; j++){
                if(nums2[i] == nums1[j]){
                    match = true;
                }
            }
            if(!match){
                set2.add(nums2[i]);
            }
        }
        ans.add(new ArrayList<Integer>(set1));
        ans.add(new ArrayList<Integer>(set2));
        return ans;

    }
}
}
