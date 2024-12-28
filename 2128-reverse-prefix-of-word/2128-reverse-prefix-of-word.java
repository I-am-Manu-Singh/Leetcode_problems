class Solution {
    public String reversePrefix(String word, char ch) {
        int left=0;
        char a[]=word.toCharArray();
        int right=word.indexOf(ch);

        if(right==-1){
            return word;
        }
        while(left<right){
               char cx=a[left];
               a[left]=a[right];
               a[right]=cx;
               left++;
               right--;
        }
        String str = String.copyValueOf(a);
        return str;
    }
}