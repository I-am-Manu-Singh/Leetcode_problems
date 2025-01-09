class Solution {
    public int Count(String[] words, String pref) {
        int count=0;
        int len=words.length;
        for(int i=0;i<len;i++){
            if(words[i].startsWith(pref)){
                count++;
            }
        }
        return count;
    }
    public int prefixCount(String[] words, String pref) {
        return Count(words,pref);
    }
}