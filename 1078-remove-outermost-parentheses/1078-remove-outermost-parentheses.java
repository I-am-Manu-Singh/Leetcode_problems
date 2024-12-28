class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int balance = 0;
        int firstOpen = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                balance--;
            } else {
                balance++;
            }
            if(balance == 0) {
                sb.append(s.substring(firstOpen + 1, i));
                firstOpen = i + 1;
            }
        }
        return sb.toString();
    }
}