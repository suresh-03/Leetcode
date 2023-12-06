public class _1662_check2StringArrEqual {
    class Solution {
        public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
            StringBuilder w1 = new StringBuilder();
            StringBuilder w2 = new StringBuilder();
    
            int len1 = 0;
            int len2 = 0;
    
            while(len1 < word1.length || len2 < word2.length){
                if(len1 < word1.length){
                    w1.append(word1[len1]);
                    len1++;
                }
                if(len2 < word2.length){
                    w2.append(word2[len2]);
                        len2++;
                }
            }
    
            if(w1.toString().equals(w2.toString())){
                return true;
            }
            return false;
        }
    }
}
