class Solution {
    public String reversePrefix(String word, char ch) {
        int left=0;
        char a[]=word.toCharArray();
        int right=word.indexOf(ch);

        if(right==-1){
            return word;
        }
        while(left<right){
               char cx=a[right];
               a[right]=a[left];
               a[left]=cx;
               left++;
               right--;
        }
        String str = String.copyValueOf(a);
        return str;
    }
}