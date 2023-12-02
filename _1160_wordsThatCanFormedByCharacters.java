public class _1160_wordsThatCanFormedByCharacters {
    class Solution {
        public int countCharacters(String[] words, String chars) {
            int[] ch = new int[26];
            int ans = 0;
            for(int i = 0; i < chars.length(); i++){
                ch[chars.charAt(i)-'a']++;
            }
            for(int i = 0; i < words.length; i++){
                int[] str = new int[26];
                for(int j = 0; j < words[i].length(); j++){
                    str[words[i].charAt(j)-'a']++;
                }
                boolean has = true;
                for(int k = 0; k < 26; k++){
                    if(ch[k] < str[k]){
                        has = false;
                    }
                }
                if(has){
                    ans += words[i].length();
                }
            }
            return ans;
        }
    }
}
