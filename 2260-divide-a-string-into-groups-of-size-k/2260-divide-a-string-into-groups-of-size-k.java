class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < s.length(); i += k) {
            int end = Math.min(i + k, s.length());
            String tmp = s.substring(i, end);

            // Pad with fill character if length is less than k
            while (tmp.length() < k) {
                tmp += fill;
            }

            ans.add(tmp);
        }

        // Convert List<String> to String[]
        return ans.toArray(new String[0]);
    }
}