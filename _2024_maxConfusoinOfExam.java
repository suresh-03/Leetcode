public class _2024_maxConfusoinOfExam {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int r = 0;
        int l = 0;
        int F = 0;
        int T = 0;
        int ans = 0;

        for(;r < answerKey.length(); r++){
            if(answerKey.charAt(r) == 'F') F++;
            if(answerKey.charAt(r) == 'T') T++;
            if(T > F){
                while(T > F && F > k){
                    if(answerKey.charAt(l) == 'T') T--;
                    else{
                        F--;
                    }
                    l++;
                }
            }
            else{
                while(F >= T && T > k){
                    if(answerKey.charAt(l) == 'T') T--;
                    else{
                        F--;
                    }
                    l++;
                }
            }
            ans = Math.max(ans,r-l+1);

        }
        return ans;
    }
}
