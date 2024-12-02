class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        
        String word[] = sentence.split(" ");
        int m = searchWord.length();
        int n = word.length;

        for(int i = 0; i < n ; i++) {
            if(word[i].length() >= searchWord.length()){
                if(word[i].substring(0, m).equals(searchWord)) {
                    return i+1;
                }
            }
        }
        return -1;
    }
}