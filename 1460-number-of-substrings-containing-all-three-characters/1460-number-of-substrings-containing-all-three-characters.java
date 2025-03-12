class Solution {
    public int numberOfSubstrings(String s) {
        int freq[] = new int[3];
        int count = 0;
        int currcount = 0;
        int left = 0;
        int n = s.length();
        for(int right = 0; right < n; right++) {
            char ch = s.charAt(right);
            freq[ch - 'a']++;
            if(freq[ch -'a'] == 1){
                currcount++;
            }

            while(currcount==3) {
                count += (n-right);
                char c = s.charAt(left);
                freq[c-'a']--;
                if(freq[c-'a'] == 0){
                    currcount--;
                }
            left++;
            }
        }
        return count;
    }
}