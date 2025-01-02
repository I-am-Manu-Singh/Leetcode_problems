class Solution {
    public int[] vowelStrings(String[] words, int[][] q) {
        int n=q.length;
        int[] res=new int[n];
        int[] pre=new int[words.length];
        Set<Character> set=Set.of('a','e','i','o','u');
        int sum=0;
        for(int i=0;i<words.length;i++){
            String word=words[i];
            if(set.contains(word.charAt(0)) && set.contains(word.charAt(word.length()-1))){
                sum++;
            }
            pre[i]=sum;
        }
        int idx=0;
        for(int[] qr:q){
            int i=qr[0];
            int j=qr[1];
            if(i>0){
                res[idx++]=pre[j]-pre[i-1];
            }else{
                res[idx++]=pre[j];
            }
        }
        return res;
    }
}