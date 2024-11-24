import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> S = new Stack<>();
        for(int i = 0;  i< s.length(); i++){
            char ch = s.charAt(i);

            //opening
            if(ch == '(' || ch == '{' || ch == '['){
                S.push(ch);
            }
            else{
                if(S.isEmpty()){
                    return false;
                }
                if((S.peek() == '(' && ch == ')') || (S.peek() == '{' && ch == '}') ||(S.peek() == '[' && ch == ']') ){ //for the closing
                    S.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(S.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}