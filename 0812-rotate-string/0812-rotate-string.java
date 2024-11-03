class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb=new StringBuilder(s);
        int count=0;
        
        if(s.length()!=(goal.length())) return false;
        
        while(!(sb.substring(0,sb.length()).equals(goal.substring(0,goal.length())))){
            if(count>=s.length()) return false;
            char first=sb.charAt(0);
            sb=sb.deleteCharAt(0).append(first+"");
            count++;
        }
        return true;
    }
}