class _6_zigZagConversion{
    class Solution {
        public String convert(String s, int numRows) {
              
            if(s.isEmpty() || s.length() <= 2 || numRows == 1){
                return s;
            }
            char[][] pattern = new char[numRows][s.length()];
            StringBuilder ans = new StringBuilder();
            int len = s.length();
            int row = 0;
            int col = 0;
            int index = 0;
    
            if(numRows == 2){
                for(int i = 0; i < s.length(); i+=2){
                    ans.append(s.charAt(i));
                }
                for(int i = 1; i < s.length(); i+=2){
                    ans.append(s.charAt(i));
                }
                return ans.toString();
            }
    
            while(index != len){
                if(row < numRows && col == 0 ||row < numRows && col % (numRows-1) == 0){
                    // System.out.println(row);
    
                    pattern[row][col] = s.charAt(index);
                    // ans.append(s.charAt(index));
                    index++;
                    row++;
                }
                else{
                    if(row == numRows){
                        row-=2;
                        col++;
                    // System.out.println(row);
    
                    }
                    // System.out.println(row);
                    
                    pattern[row][col] = s.charAt(index);
                    if(row != 0)row--;
                    col++;
                    // ans.append(s.charAt(index));
                    index++;
                }
        
        }
        for(int i = 0; i < pattern.length; i++){
            for(int j = 0; j < pattern[i].length; j++){
                if(pattern[i][j] >= 'A'&& pattern[i][j] <= 'Z' || pattern[i][j] >= 'a' && pattern[i][j] <= 'z' || pattern[i][j] == '.' || pattern[i][j] == ','){
                    ans.append(pattern[i][j]);
                }
            }
        }
                    return ans.toString();
        }
    }
}