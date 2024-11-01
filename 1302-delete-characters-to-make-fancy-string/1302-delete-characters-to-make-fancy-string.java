class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        sb.append(s.charAt(0));

        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)) {
                //count
                if(counter >= 1) {
                    continue;
                }
                sb.append(s.charAt(i));
                counter++;
            }
            else{
                counter = 0;
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();

    }
}