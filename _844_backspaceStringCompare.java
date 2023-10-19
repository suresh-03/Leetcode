import java.util.Stack;

public class _844_backspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> Sstk = new Stack<>();
        Stack<Character> Tstk = new Stack<>();

        int Sind = 0;
        int Tind = 0;

        while(Sind < s.length() || Tind < t.length()){
            if(Sind < s.length()){
                if(s.charAt(Sind) != '#'){
                    Sstk.push(s.charAt(Sind));
                }
                else{
                    if(!Sstk.isEmpty())
                    Sstk.pop();
                }
                Sind++;
            }
            if(Tind < t.length()){
                if(t.charAt(Tind) != '#'){
                    Tstk.push(t.charAt(Tind));
                }
                else{
                    if(!Tstk.isEmpty())
                    Tstk.pop();
                }
                Tind++;
            }
        }
        if(Sstk.equals(Tstk)){
            return true;
        }
        return false;

    }
}
