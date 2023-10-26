import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _823_binaryTreesWithFactors {
   
    public int numFactoredBinaryTrees(int[] arr) {
        HashMap<Integer,Long> map = new HashMap<>();
        long ans = 0;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i],1l);
        }
        for(int i = 0; i < arr.length; i++){
            long count = 0;
            for(int j = 0; j < i; j++){
                if(arr[i] % arr[j] == 0){
                    int element = arr[i] / arr[j];
                    if(map.containsKey(element)){
                        count += map.get(element) * map.get(arr[j]);
                    }
                }
            }
            map.put(arr[i],map.get(arr[i])+count);
        }
        for(Map.Entry<Integer,Long> set : map.entrySet()){
            ans += set.getValue();
        }
        return (int)(ans % (Math.pow(10,9)+7));
    }
}

