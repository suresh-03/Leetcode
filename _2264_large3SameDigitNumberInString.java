public class _2264_large3SameDigitNumberInString {
    class Solution {
        public String largestGoodInteger(String num) {
            int max = Integer.MIN_VALUE;
            StringBuilder ans = new StringBuilder();
            for(int i = 0; i < num.length()-2; i++){
                if(num.charAt(i) == num.charAt(i+1) && num.charAt(i+1) == num.charAt(i+2)){
                   if(max < (int)(num.charAt(i)-48)){
                       ans.setLength(0);
                    ans.append(num.substring(i,i+3));
                    max = (int)(num.charAt(i)-48);
                   }
            }
        }
        return ans.toString();
    }
    }
}
