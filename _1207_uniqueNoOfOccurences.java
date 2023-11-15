import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class _1207_uniqueNoOfOccurences {
    class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(Map.Entry<Integer,Integer> list : map.entrySet()){
            if(set.contains(list.getValue())){
                return false;
            }
            set.add(list.getValue());
        }
        return true;
    }
}
}
