class Solution {
    public int takeCharacters(String s, int k) {
        if (k == 0) return 0;
        
        int[] count = new int[3];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        
        for (int i = 0; i < 3; i++) {
            if (count[i] < k) return -1;
        }
        
        int maxLen = 0;
        int left = 0;
        int[] currCount = new int[3];
        
        for (int right = 0; right < s.length(); right++) {
            currCount[s.charAt(right) - 'a']++;
            
            while (left <= right && (count[0] - currCount[0] < k || 
                                   count[1] - currCount[1] < k || 
                                   count[2] - currCount[2] < k)) {
                currCount[s.charAt(left) - 'a']--;
                left++;
            }
            
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return s.length() - maxLen;
    }
}