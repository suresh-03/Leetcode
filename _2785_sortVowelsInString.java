public class _2785_sortVowelsInString {
    class Solution {
        public String sortVowels(String s) {
            StringBuilder ans = new StringBuilder();
            ArrayList<Character> vowel = new ArrayList<>();
            HashSet<Character> set = new HashSet<>();
            set.add('A');
            set.add('E');
            set.add('I');
            set.add('O');
            set.add('U');
            set.add('a');
            set.add('e');
            set.add('i');
            set.add('o');
            set.add('u');
    
            for(int i = 0; i < s.length(); i++){
                if(set.contains(s.charAt(i))){
                    vowel.add(s.charAt(i));
                }
            }
            if(vowel.size() == 0) return s;
            Collections.sort(vowel);
            int j = 0;
            for(int i = 0; i < s.length(); i++){
                if(!set.contains(s.charAt(i))){
                    ans.append(s.charAt(i));
                }
                else{
                    ans.append(vowel.get(j));
                    j++;
                }
            }
            return ans.toString();
            
        }
    }
}
