import java.util.ArrayList;
import java.util.List;

public class _38_countAndSay {
    class Solution {
    public String countAndSay(int n) {
        List<Integer> ans = helper(n-1);
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < ans.size(); i++){
            str.append(ans.get(i));
        }
        return str.toString();
    }
    public List<Integer> helper(int n){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for(int i = 1; i <= n; i++){
            int count = 1;
            List<Integer> temp = new ArrayList<>();
            for(int j = 0; j < list.size()-1; j++){
                if(list.get(j) == list.get(j+1)){
                    count++;
                }
                else{
                    temp.add(count);
                    temp.add(list.get(j));
                    count = 1;
                }
            }
                temp.add(count);
                temp.add(list.get(list.size()-1));
            
            list.clear();
            list.addAll(temp);
        }
        return list;
    }
}
}
