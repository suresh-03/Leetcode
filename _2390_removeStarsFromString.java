import java.util.ArrayList;
import java.util.Stack;

public class _2390_removeStarsFromString {
        public String removeStars(String s) {
        Stack<Character> stk=new Stack<>();
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '*') stk.pop();
            else{
                stk.push(s.charAt(i));
            }
        }
        ArrayList<Character> list = new ArrayList<>(stk);
        for(int i = 0; i < list.size(); i++){
            str.append(list.get(i));
        }
        return str.toString();
    }
}
