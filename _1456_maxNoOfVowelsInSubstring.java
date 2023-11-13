public class _1456_maxNoOfVowelsInSubstring {
    class Solution {
        public int maxVowels(String s, int k) {
            int r = 0;
            int l = 0;
            int vowels = 0;
            int ans = 0;
    
            for(;r < s.length(); r++){
                if(s.charAt(r) == 'a' || s.charAt(r) == 'e' || s.charAt(r) == 'i' || s.charAt(r) == 'o' || s.charAt(r) == 'u'){
                    vowels++;
                }
            
                if((r-l+1) > k){
                      if(s.charAt(l) == 'a' || s.charAt(l) == 'e' || s.charAt(l) == 'i' || s.charAt(l) == 'o' || s.charAt(l) == 'u'){
                    vowels--;
                }
                l++;
                }
                    if((r-l+1) == k){
                ans = Math.max(ans,vowels);
                }
    
            }
            return ans;
        }
    }
}
