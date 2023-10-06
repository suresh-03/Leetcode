public class _343_integerBreak {
    public int integerBreak(int n) {
        
        if(n <= 3) return n-1;
        int remainder = n % 3,quotient = n / 3;
       
 
       return remainder == 0 ? (int)Math.pow(3,quotient) : remainder == 1 ? (int)Math.pow(3,quotient-1) * 4 : (int)Math.pow(3,quotient)*2; 
    }
}
