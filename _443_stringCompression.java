public class _443_stringCompression {
    class Solution {
        public int compress(char[] chars) {
            if(chars.length == 1) return 1;
    
            int length = 0;
            int count = 1;
    
            int j = 0;
            for(int i = 0; i < chars.length-1; i++){
              if(chars[i] == chars[i+1]){
                  count++;
              }
              else{
                if(count > 1){
                  if(count < 9){
                      chars[j] = chars[i];
                      j++;
                      length++;
                      chars[j] = (char)(count+48);
                      j++;
                      length++;
                  }
                  else{
                      chars[j] = chars[i];
                      j++;
                      length++;
                      String c = Integer.toString(((int)count));
                      char[] temp = c.toCharArray();
                      for(int k = 0; k < temp.length; k++){
                          chars[j] = temp[k];
                          j++;
                          length++;
                      }
                  }
                  count = 1;
                }
                else{
                    chars[j] = chars[i];
                    j++;
                    length++;
                }
              }
                   
            }
            if(count > 1){
                if(count < 9){
                      chars[j] = chars[chars.length-1];
                      j++;
                      length++;
                      chars[j] = (char)(count+48);
                      j++;
                      length++;
                }
                else{
                     chars[j] = chars[chars.length-1];
                      j++;
                      length++;
                      String c = Integer.toString(((int)count));
                      char[] temp = c.toCharArray();
                      for(int k = 0; k < temp.length; k++){
                          chars[j] = temp[k];
                          j++;
                          length++;
                      }
                }
            }
             else{
                    chars[j] = chars[chars.length-1];
                    j++;
                    length++;
                }
            return length;
        }
    }
}
