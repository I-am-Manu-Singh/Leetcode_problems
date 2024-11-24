class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min=Integer.MAX_VALUE;
        StringBuilder prefix = new StringBuilder();
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<min){
                min=strs[i].length();
            }
        }
        for(int i=0;i<min;i++){
            char word=strs[0].charAt(i);
            for(int j=0;j<strs.length;j++){
                if(strs[j].charAt(i)!=word){
                    return  prefix.toString();
                }
            }
            prefix.append(word);
        }
        return prefix.toString();
    }
}