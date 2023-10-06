import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _229_majorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            // if(map.get(nums[i]) != null){
            //     map.put(nums[i],1 + map.get(nums[i]));
            // }
            // else{
            //     map.put(nums[i],0);
            // }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> set : map.entrySet()){
            if(set.getValue() > nums.length / 3){
                list.add(set.getKey());
            }
        }

        System.out.println(map);


        return list;
    }
}
