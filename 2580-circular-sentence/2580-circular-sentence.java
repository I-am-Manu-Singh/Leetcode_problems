class Solution {
    public boolean isCircularSentence(String sentence) {
        // Step 1: Split the sentence into words
        String[] words = sentence.split(" ");
        
        // Step 2: Check each word's last character with the first character of the next word
        for (int i = 0; i < words.length - 1; i++) {
            // Get the last character of the current word and the first character of the next word
            if (words[i].charAt(words[i].length() - 1) != words[i + 1].charAt(0)) {
                return false;
            }
        }
        
        // Step 3: Check the circular condition between the last and first word
        return words[words.length - 1].charAt(words[words.length - 1].length() - 1) == words[0].charAt(0);
    }
}
