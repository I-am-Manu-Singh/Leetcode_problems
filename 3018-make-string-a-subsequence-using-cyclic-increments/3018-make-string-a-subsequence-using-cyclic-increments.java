class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        int i=0,j=0;
        while(i<ch1.length && j<ch2.length){
            if(ch1[i]=='z' && ch2[j]=='a'){
                i++;
                j++;
            }else if(ch1[i]==ch2[j]){
                i++;
                j++;
            }else if((ch2[j]-ch1[i]) == 1){
                i++;
                j++;
            }else{
                i++;
            }
        }
        if(j == ch2.length){
            return true;
        }
        return false;
    }
}