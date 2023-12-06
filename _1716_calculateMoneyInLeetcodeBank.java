public class _1716_calculateMoneyInLeetcodeBank {
    class Solution {
        public int totalMoney(int n) {
            int total = 0;
            int m = 1;
            int money = 1;
            for(int i = 1; i <= n; i++){
                total += money;
                money++;
                if(i % 7 == 0){
                    m++;
                    money = m;
                }
            }
            return total;
        }
    }
}
