public class _151_reverseWordsInString {
    class Solution {
        public String reverseWords(String s) {
            s = s.trim();
            String[] str = s.split(" ");
            StringBuilder ans = new StringBuilder();
            for(int i = str.length-1; i >= 0; i--){
                if(!str[i].equals("")){
                    // System.out.println(str[i]+".");
                    ans.append(str[i].trim());
                    ans.append(" ");
                }
            }
            return ans.toString().trim();
        }
    }
}
