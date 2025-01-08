class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        //using starts and endswith functions.
        //to implemented in trie should implement a trie for prefix search and suffix tree for suffix search.
        int n=words.length, cnt=0;
        for(int i=0;i<words.length;i++){
            for (int j=i+1;j<words.length;j++){
                if(words[i].length()<=words[j].length()){
                    if(isprandsf(words[i],words[j])) cnt++;
                }
            }
        }
        return cnt;
    }
    private boolean isprandsf(String w1,String w2){
        return w2.startsWith(w1) && w2.endsWith(w1);
    }
}