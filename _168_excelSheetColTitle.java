public class _168_excelSheetColTitle {
    class Solution {
        public String convertToTitle(int col) {
           
            StringBuilder ans = new StringBuilder();
            while(col > 0){
             ans.append(Character.toString((char)(((col-1)%26)+65)));
             col = (col-1)/26;
    
            }
            return ans.reverse().toString();
    
        }
    }
}
