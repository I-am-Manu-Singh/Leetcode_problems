class Solution {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        int word_freq;
        
        for (int i = 0; i < word.length(); i++) {
            word_freq = 1;
            
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j) && word_freq < 9) {
                    word_freq++;
                } else {
                    break; 
                }
            }
            
            comp.append(word_freq);
            comp.append(word.charAt(i));
            
            i += word_freq - 1;
        }
        
        return comp.toString();  
    }
}