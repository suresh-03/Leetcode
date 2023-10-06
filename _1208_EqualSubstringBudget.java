public class _1208_EqualSubstringBudget {
        public int equalSubstring(String s, String t, int maxCost) {
            int r = 0;
            int l = 0;
            int ans = 0;
            int cost = 0;
    
            for(;r < s.length(); r++){
                cost += Math.abs(s.charAt(r)-t.charAt(r));
                while(cost > maxCost){
                    cost -= Math.abs(s.charAt(l)-t.charAt(l));
                    l++;
                }
                ans = Math.max(ans,r-l+1);
            }
        return ans;
    
        }
    
}
