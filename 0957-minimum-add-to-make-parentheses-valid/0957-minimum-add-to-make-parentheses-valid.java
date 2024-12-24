class Solution {
    public int minAddToMakeValid(String s) {
        return helper(s, 0, 0, 0); // Pass initial open, close counts, and index
    }

    public int helper(String curr, int open, int close, int index) {
        // Base case: if we've checked all characters in the string
        if (index == curr.length()) {
            return open; // At the end, all unmatched open parentheses should be added
        }

        int count = 0;
        char c = curr.charAt(index);

        if (c == '(') {
            count += helper(curr, open + 1, close, index + 1); // Increment open count
        } else {
            if (open > 0) {
                count += helper(curr, open - 1, close, index + 1); // Match with open, reduce open
            } else {
                count += 1 + helper(curr, open, close, index + 1); // No open to match, add one to count
            }
        }

        return count;
    }
}