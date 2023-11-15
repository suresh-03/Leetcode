import java.util.Arrays;

public class _1846_maxElementDecreaseAndRearrange {
    class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        if(arr[0] != 1) arr[0] = 1;
        if(arr.length == 1) return arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i]-arr[i-1] > 1){
                arr[i] = arr[i-1]+1;
            }
        }
        return arr[arr.length-1];
    }
}
}
