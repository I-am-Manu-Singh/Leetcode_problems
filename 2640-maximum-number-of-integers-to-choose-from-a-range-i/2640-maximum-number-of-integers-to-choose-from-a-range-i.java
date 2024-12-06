class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        // Create a set to store banned numbers for O(1) look-up
        Set<Integer> set = new HashSet<>();
        for (int x : banned) {
            set.add(x); // Add each banned number to the set
        }

        int csum = 0; // Current sum of selected numbers
        int counter = 0; // Count of selected numbers

        // Iterate through numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            // Skip the number if it is in the banned set
            if (set.contains(i)) continue;

            // Check if adding the current number exceeds maxSum
            if (csum + i > maxSum) {
                return counter; // Return the count if maxSum is exceeded
            }

            // Add the current number to the sum and increment the count
            csum += i;
            counter++;
        }

        // Return the total count of numbers that can be selected
        return counter;
    }
}