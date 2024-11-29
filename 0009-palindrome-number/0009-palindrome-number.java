class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
            
        } else if( x == 0) {
            return true;
        }

        int ans = 0;
        int org = x;
        while( x != 0) {
            int rem = x % 10;
            x = x / 10;
            ans = ans * 10 + rem;
        }

        return ans == org;
    }
}