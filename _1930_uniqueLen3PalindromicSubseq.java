import java.util.HashSet;

public class _1930_uniqueLen3PalindromicSubseq {
    class Solution {
    public int countPalindromicSubsequence(String s) {
        int[] first = new int[26];
        int[] last = new int[26];

        for(int i = 0; i < 26; i++){
            first[i] = Integer.MAX_VALUE;
            last[i] = Integer.MIN_VALUE;
        }

        for(int i = 0; i < s.length(); i++){
            int index = s.charAt(i)-'a';
            first[index] = Math.min(first[index],i);
            last[index] = Math.max(last[index],i);
            }

        int count = 0;

        for(int i = 0; i < 26; i++){
            if(first[i] == Integer.MAX_VALUE || last[i] == Integer.MIN_VALUE){
                continue;
            }

            HashSet<Character> unique = new HashSet<>();
            for(int j = first[i]+1; j < last[i]; j++){
                unique.add(s.charAt(j));
            }
            count += unique.size();
        }
        return count;

    }
}
}
