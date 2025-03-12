class Solution {
    public long countOfSubstrings(String word, int k) {
       return atLeastOneConsonant(k, word - atLeastOneConsonant(k + 1, word)); 
    }

    public boolean isConsonant(char ch) {
       return (ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' );
    }

    public boolean allVowelsPresent (int freq[]) {
        return (freq['a'-'a'] > 0 && freq['e'-'a'] > 0 && freq['i'-'a'] > 0 && freq['o'-'a'] > 0 && freq['u'-'a'] > 0);
    }

    public long atLeastOneConsonant(int k, String words) {
        long count = 0;
        int currentConsonant = 0;
        int freq[] = new int [26];
        int n = words.length();
        int left = 0;
        for(int right = 0; right < n; right++) {
            char ch = words.charAt(right);
            if(isConsonant(ch)) {
                currentConsonant++;
            }
            freq[ch-'a']++;
            while(currentConsonant >= k && allVowelsPresent(freq)) {
                count += n-right;
                char charac = words.charAt(left);
            if(isConsonant(charac)){
                currentConsonant--;
            }
            freq[charac-'a']--;
            left++;
            }
        }
        return count;
    }
}