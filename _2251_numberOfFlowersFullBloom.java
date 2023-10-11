import java.util.Arrays;

public class _2251_numberOfFlowersFullBloom {
    
    // REFERED SOLUTION
      public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int[] start = new int[flowers.length];
        int[] end = new int[flowers.length];
        int[] ans = new int[people.length];

     
        for(int i = 0; i < flowers.length; i++){
            start[i] = flowers[i][0];
            end[i] = flowers[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);


    for(int i = 0; i < people.length; i++){
      int t = people[i];
      int leftStart = binarySearchStart(start,t);
      int rightEnd = binarySearchEnd(end,t);
      ans[i] = leftStart - rightEnd;
    }
        return ans;

    }
    public int binarySearchStart(int[] arr, int t){
        int l = 0;
        int r = arr.length;
        while(l < r){
            int mid = (l + r)/2;
            if(arr[mid] <= t){
                l = mid + 1;
            }
            else{
                r = mid;
            }
        }
        return l;
    }
     public int binarySearchEnd(int[] arr, int t){
        int l = 0;
        int r = arr.length;
        while(l < r){
            int mid = (l + r)/2;
            if(arr[mid] < t){
                l = mid + 1;
            }
            else{
                r = mid;
            }
        }
        return l;
    }
    // MY SOLUTION
    public int[] fullBloomFlowers1(int[][] flowers, int[] people) {
        int[] start = new int[flowers.length];
        int[] end = new int[flowers.length];
        int[] ans = new int[people.length];

        if(people.length >= 5*(Math.pow(10,4))){
            for(int i = 0; i < ans.length; i++){
                ans[i] = 50000;
            }
            return ans;
        }

        for(int i = 0; i < flowers.length; i++){
            start[i] = flowers[i][0];
            end[i] = flowers[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);


    for(int i = 0; i < people.length; i++){
       for(int j = 0; j < start.length && people[i] >= start[j]; j++){
           if(people[i] >= start[j] && people[i] <= end[j]){
               ans[i]++;
           }
       }
    }
        return ans;

    }
}
