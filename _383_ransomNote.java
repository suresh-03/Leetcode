public class _383_ransomNote {
    public boolean canConstruct(String ransomeNote, String magazine) {
        int[] ransom = new int[26];
        int[] mag = new int[26];

        for(int i = 0; i < ransomeNote.length(); i++){
            ransom[ransomeNote.charAt(i)-'a']++;
        }
          for(int i = 0; i < magazine.length(); i++){
            mag[magazine.charAt(i)-'a']++;
        }
        for(int i = 0; i < ransomeNote.length(); i++){
            if(mag[ransomeNote.charAt(i)-'a'] < ransom[ransomeNote.charAt(i)-'a']){
                return false;
            }
        }
        return true;

    }
}
