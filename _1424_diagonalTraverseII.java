import java.util.ArrayList;
import java.util.List;

public class _1424_diagonalTraverseII {
    class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        if(nums.size() == 1){
            int[] arr = new int[nums.get(0).size()];
            for(int i = 0; i < nums.get(0).size(); i++){
                arr[i] = nums.get(0).get(i);
            }
            return arr;
        }
       List<List<Integer>> dia = new ArrayList<>();
       int size = 0;
       for(int i = 0; i < nums.size()*10; i++){
           dia.add(new ArrayList<Integer>());
       }

        for(int i = 0; i < nums.size(); i++){
            for(int j = 0; j < nums.get(i).size(); j++){
                dia.get(i+j).add(nums.get(i).get(j));
                size++;
            }
        }
        int[] ans = new int[size];
        int k = 0;
        for(int i = 0; i < dia.size(); i++){
            for(int j = dia.get(i).size()-1; j >= 0; j--){
                ans[k] = dia.get(i).get(j);
                k++;
            }
        }
        return ans;
    }
}
}
