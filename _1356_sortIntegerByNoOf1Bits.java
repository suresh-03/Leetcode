import java.util.Arrays;

public class _1356_sortIntegerByNoOf1Bits {
    class Solution {
    public int[] sortByBits(int[] arr) {
        int[] value = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            int val = arr[i];
            int count = 0;
            while(val != 0){
                if((val & 1) == 1){
                    count++;
                }
                val = val >> 1;
            }
            value[i] = count;
        }
        
        for(int i = 0; i < value.length; i++){
            for(int j = i+1; j < value.length; j++){
                if(value[i] > value[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    int temp2 = value[i];
                    value[i] = value[j];
                    value[j] = temp2;
                }
                else if(value[i] == value[j]){
                    if(arr[i] > arr[j]){
                        int tem = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tem;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(value));
    return arr;

    }
}
}
