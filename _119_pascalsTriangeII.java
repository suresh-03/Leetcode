import java.util.ArrayList;
import java.util.List;

public class _119_pascalsTriangeII {
    class Solution {
        public List<Integer> getRow(int rowIndex) {
            ArrayList<Integer> ans = new ArrayList<>();
    
            if(rowIndex == 0){
               ans.add(1);
               return ans;
            }
            ans.add(1);
            ans.add(1);
    
            for(int i = 2; i <= rowIndex; i++){
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j = 0; j < i-1; j++){
                    temp.add(ans.get(j)+ans.get(j+1));
                }
                temp.add(0,1);
                temp.add(1);
                ans = temp;
    
            }
    
    
            return ans;
        }
    }
}
