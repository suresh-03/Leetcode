import java.util.Arrays;

class _1980_findUniqueBinaryString{
    class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int[] arr = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int number = 0;
            int power = 0;
            for(int j = nums[i].length()-1; j >= 0; j--){
                if(nums[i].charAt(j) == '0'){
                    number += (0*Math.pow(2,power));
                }
                else{
                    number += (1*Math.pow(2,power));
                }
                power++;
            }
        arr[i] = number;
        }
        Arrays.sort(arr);
       System.out.println(Arrays.toString(arr));
        int max = (int)Math.pow(2,nums[0].length())-1;
        int min = 0;
        if(arr[0] != min){
            StringBuilder ans = new StringBuilder();
            for(int i = 0; i < nums[0].length(); i++){
                ans.append(0);
            } 
            return ans.toString();
        }
        else if(arr[arr.length-1] != max){
            return binary(max);
        }
        String s = "";
       for(int i = 1; i < arr.length; i++){
           if(arr[i-1] != arr[i]-1){
               s = binary(arr[i]-1);
               break;
           }
       }
       if(s.length() < nums[0].length()){
           StringBuilder s1 = new StringBuilder();
           for(int i = 0; i < nums[0].length()-s.length(); i++){
               s1.append(0);
           }
           s1.append(s);
           return s1.toString();
       }
       return s;
    }
    public String binary(int num){
        StringBuilder ans1 = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        while(num > 1){
            int temp = num % 2;
            ans1.append(temp);
            num /= 2;
        }
        ans1.append(num);
        for(int i = ans1.length()-1; i >= 0; i--){
            ans.append(ans1.charAt(i));
        }
        return ans.toString();
    }
}
}