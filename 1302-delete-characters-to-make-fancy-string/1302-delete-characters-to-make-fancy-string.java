class Solution {
    public String makeFancyString(String s) {
        int count=0;
        StringBuilder sb=new StringBuilder(s);
        for(int i=1;i<sb.length();i++){
            
            if(sb.charAt(i)==sb.charAt(i-1)){
                count++;
                if(count==2){
                    sb.deleteCharAt(i);
                    count--;
                    i--;
                }
            }else{
                    count=0;
                }
        }return sb.toString();
    }
}