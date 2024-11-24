class Solution {
    /**
     * Finds the maximum sum of the matrix after performing the allowed operations.
     *
     * @param matrix The input 2D matrix of integers.
     * @return The maximum possible sum of the matrix elements.
     */
    public long maxMatrixSum(int[][] matrix) {
        // Variable to store the minimum absolute value in the matrix
        int minabs = Integer.MAX_VALUE;

        // Counter for negative elements in the matrix
        int ncount = 0;

        // Variable to store the cumulative sum of absolute values of matrix elements
        long sum = 0;

        // Dimension of the matrix (n x n)
        int n = matrix.length;

        // Traverse each element in the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = matrix[i][j];

                // Add the absolute value of the current element to the sum
                sum += Math.abs(val);

                // Count the negative elements
                if (val < 0) {
                    ncount++;
                }

                // Update the smallest absolute value found so far
                minabs = Math.min(minabs, Math.abs(val));
            }
        }

        // If there is an odd count of negative elements:
        // After making all possible flips, one negative will remain,
        // so we reduce the sum by 2 times the smallest absolute value.
        if (ncount % 2 == 1) {
            sum -= 2 * minabs;
        }

        // Return the calculated maximum sum
        return sum;
    }


}