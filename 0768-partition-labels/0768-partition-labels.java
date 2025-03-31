class Solution {
    public List<Integer> partitionLabels(String s) {
        int start = 0;
        int n = s.length();
        List<Integer> result = new ArrayList<>();
        while(start < n) {
            int end = start;
            while(end < n) {
                String left = s.substring(start,end+1);
                String right = (end + 1 < n) ? s.substring(end+1, n) : "";
                if(containChars(left,right)) {
                    result.add(left.length());
                    start = end + 1;
                    break;
                }
                else {
                    end++;
                }
            }
        }
        return result;
    }
    private boolean containChars(String l , String r) {
        for(char c : l.toCharArray()) {
            if(r.contains(c + ""))
                return false;
        }
        return true;
    }
}