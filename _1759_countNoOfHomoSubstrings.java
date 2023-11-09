public class _1759_countNoOfHomoSubstrings {
    class Solution {
        public int countHomogenous(String s) {
            long ans = 0;
            int right = 0;
            int left = 0;
    
            for(;right < s.length(); right++){
                while(s.charAt(left) != s.charAt(right)){
                    left++;
                }
                ans += right - left + 1;
            }
            return (int)(ans%(Math.pow(10,9)+7));
        }
    }
}
