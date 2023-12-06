public class _43_multiplyStrings {
    class Solution {
        public String multiply(String num1, String num2) {
            StringBuilder answer = new StringBuilder();
            if(num1.equals("0") || num2.equals("0")) return "0";
            int zero = 0;
            for(int i = num2.length()-1; i >= 0; i--){
                int carry = 0;
                StringBuilder mul = new StringBuilder();
                for(int j = num1.length()-1; j >= 0; j--){
                    int n1 = num1.charAt(j)-48;
                    int n2 = num2.charAt(i)-48;            
                    int multi = n1*n2;
                    int sum = multi+carry;
                    mul.append(sum%10);
                    if(sum > 9){
                        carry = sum / 10;
                    }
                    else{
                        carry = 0;
                    }
                    
                    }
                    if(carry > 0){
                        mul.append(carry);
                    }
                    mul = mul.reverse();
                    for(int x = 0; x < zero; x++){
                        mul.append("0");
                    }
                    zero++;
                    System.out.println(mul);
                    if(answer.toString().isEmpty()){
                        answer.append(mul);
                    }
                    else{
                        answer = plus(answer,mul);
                    }
            }
            return answer.toString();
        }
        public StringBuilder plus(StringBuilder num1,StringBuilder num2){
            StringBuilder ans = new StringBuilder();
            int i = num1.length()-1;
            int j = num2.length()-1;
            int carry = 0;
            while(i >= 0 && j >= 0){
                int n1 = num1.charAt(i)-48;
                int n2 = num2.charAt(j)-48;
                int sum = n1+n2;
                int sums = carry+sum;
                ans.append(sums%10);
                if(sums > 9){
                    carry = sums/10;
                }
                else{
                    carry = 0;
                }
                i--;
                j--;
            }
            while(i >= 0){
                int sum = carry+(num1.charAt(i)-48);
                ans.append(sum%10);
                if(sum > 9){
                    carry = sum/10;
                }
                else{
                    carry = 0;
                }
                i--;
            }
            while(j >= 0){
                int sum = carry+(num2.charAt(j)-48);
                ans.append(sum%10);
                if(sum > 9){
                    carry = sum/10;
                }
                else{
                    carry = 0;
                }
                j--;
            }
            if(carry > 0){
                ans.append(carry);
            }
            ans = ans.reverse();
            System.out.println(ans);
            return ans;
        }
    }
}
