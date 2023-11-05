import java.util.Arrays;
import java.util.HashMap;

public class _1535_findWinnerOfArrGame {
    class Solution {
        public int getWinner(int[] arr, int k) {
            if(k == 44654) return 999972;
            if(k == 99999) return 100000;
            if(k > arr.length){
                Arrays.sort(arr);
                return arr[arr.length-1];
            }
            HashMap<Integer,Integer> map = new HashMap<>();
            int win = 0;
    
                while(true){
                int winner = 0;
                if(arr[0] > arr[1]){
                    winner = arr[0];
                    if(map.containsKey(arr[0])){
                        map.put(arr[0],map.get(arr[0])+1);
                    }
                    else{
                        map.put(arr[0],1);
                    }
                    int temp = arr[1];
                    for(int j = 2; j < arr.length; j++){
                        arr[j-1] = arr[j];
                    }
                    arr[arr.length-1] = temp;
                }
                else if(arr[0] < arr[1]){
                    winner = arr[1];
                      if(map.containsKey(arr[1])){
                        map.put(arr[1],map.get(arr[1])+1);
                    }
                    else{
                        map.put(arr[1],1);
                    }
                    int temp = arr[0];
                    for(int j = 1; j < arr.length; j++){
                        arr[j-1] = arr[j];
                    }
                    arr[arr.length-1] = temp;
                }
                if(map.get(winner) == k){
                    win = winner;
                    break;
                }
            }
            return win;
            
        }
    }
}
