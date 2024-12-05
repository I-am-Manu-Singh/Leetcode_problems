class Solution {
    public boolean canChange(String start, String target) {
        Stack<Pair> l=new Stack<>();
        for(int i=start.length()-1;i>=0;i--){
            if(start.charAt(i)=='L')l.add(new Pair(i,'L'));
            else if(start.charAt(i)=='R')l.add(new Pair(i,'R'));
        }
        for(int i=0;i<target.length();i++){
            char ch=target.charAt(i);
            if(ch=='_')continue;
            if(l.isEmpty())return false;
            Pair p=l.peek();
            if(ch=='L'){
                if(p.a>=i&&p.c=='L')l.pop();
                else return false;
            }else if(ch=='R'){
                if(p.a<=i&&p.c=='R')l.pop();
                else return false;
            }
        }   
        return l.isEmpty(); 
    }
    class Pair{
        int a;
        char c;
        Pair(int a,char c){
            this.a=a;
            this.c=c;
        }
    }
}