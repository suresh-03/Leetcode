import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class repeatedDNASeq {
    // My Solution
    public List<String> findRepeatedDnaSequences(String s) {
        int left = 0;
        int right = 0;
        HashMap<String,Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for(;right < s.length(); right++){
            
            while((right - left + 1) > 10){
                left++;
            }

            if((right - left + 1) == 10){
                if(map.get(s.substring(left,right+1)) == null){
                map.put(s.substring(left,right+1),0);
                }
                else{
                map.put(s.substring(left,right+1),1 + map.get(s.substring(left,right+1)));

                }
            }
        }
        System.out.println(map);
        for(Map.Entry<String,Integer> set : map.entrySet()){
            if(set.getValue() > 0){
                list.add(set.getKey());
            }
        }
        return list;
    }
    // Optimised Solution
        public List<String> findRepeatedDnaSequencesO(String s) {
        Set seen = new HashSet(), repeat = new HashSet();
        for(int i = 0; i + 9 < s.length(); i++){
            String str = s.substring(i,i+10);
            if(!seen.add(str)) repeat.add(str);
        }
        return new ArrayList<String>(repeat);
    }
}