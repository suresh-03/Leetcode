import java.util.ArrayList;
import java.util.List;

public class _1431_kidsWithGreatNumberOfCandies {
    class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        for(int i = 0; i < candies.length; i++){
            int kid = candies[i];
            int count = 0;
            for(int j = 0; j < candies.length; j++){
                if((kid+extraCandies) < candies[j]){
                    count++;
                }
            }
            if(count == 0){
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
