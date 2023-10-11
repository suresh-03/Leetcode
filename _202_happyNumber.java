public class _202_happyNumber {
    public boolean isHappy(int n) {
        while(n > 1){
            int sum = 0;
            while(n > 0){
                int temp = n % 10;
                sum += temp*temp;
                n /= 10;
            }
            n = sum;
            if(n == 2 || n == 3 || n == 4 || n == 5 || n == 6 || n == 8 || n == 9) return false;
        }
        return true;
    }
}
