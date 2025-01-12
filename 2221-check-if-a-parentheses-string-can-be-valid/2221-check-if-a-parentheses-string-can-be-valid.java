class Solution {
    public boolean canBeValid(String inputString, String locked) {
        // If the length of the string is odd, it can't be balanced
        if (inputString.length() % 2 == 1) {
            return false;
        }
        
        int minBalance = 0;  // Minimum balance needed to keep the string valid
        int maxBalance = 0;  // Maximum balance achievable without violating any locked positions
        
        // Traverse through the string
        for (int i = 0; i < inputString.length(); i++) {
            if (locked.charAt(i) == '0') {
                // Unlocked position: Adjust both min and max balances
                minBalance--;
                maxBalance++;
            } else {
                // Locked position: Determine the effect based on the character type
                if (inputString.charAt(i) == '(') {
                    // Opening bracket: Increase both min and max balances
                    minBalance++;
                    maxBalance++;
                } else {
                    // Closing bracket: Decrease both min and max balances
                    minBalance--;
                    maxBalance--;
                }
            }
            
            // Ensure minBalance doesn't go negative
            if (minBalance < 0) {
                minBalance = 0;
            }
            
            // If maxBalance goes negative at any point, the string can't be valid
            if (maxBalance < 0) {
                return false;
            }
        }
        
        // Check if the final minBalance is zero, indicating the string is balanced
        return minBalance == 0;
    }
}