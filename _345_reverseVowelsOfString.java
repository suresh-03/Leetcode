import java.util.HashSet;

public class _345_reverseVowelsOfString {
    class Solution {
    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        StringBuilder ans = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        int i = 0;
        int j = str.length-1;
        while(i < j){
            System.out.println(i);
            System.out.println(j);
            if(set.contains(str[i]) && set.contains(str[j])){
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i++;
                j--;
            }
            else if(set.contains(str[i]) && !(set.contains(str[j]))){
                j--;
            }
            else if(!(set.contains(str[i])) && set.contains(str[j])){
                i++;
            }
            else if(!(set.contains(str[i])) && !(set.contains(str[j]))){
                i++;
                j--;
            }
        }
        for(int k = 0; k < str.length; k++){
            ans.append( str[k]);
        }
        return ans.toString();
    }
}
}
