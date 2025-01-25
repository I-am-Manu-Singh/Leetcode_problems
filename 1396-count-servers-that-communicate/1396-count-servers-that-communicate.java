class Solution {
    public int countServers(int[][] grid) {
        int m = grid.length; // Number of rows in the grid
        int n = grid[0].length; // Number of columns in the grid
        
        // Iterate over each row to check for communicating servers
        for (int i = 0; i < m; i++) {
            int rc = 0; // Count of servers in the current row
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0) rc++; // Increment if a server is found
            }

            if (rc > 1) { // If more than one server is found, they can communicate
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] != 0) grid[i][j] = -1; // Mark servers in this row as communicating
                }
            }
        }

        // Iterate over each column to check for communicating servers
        for (int j = 0; j < n; j++) {
            int cc = 0; // Count of servers in the current column
            for (int i = 0; i < m; i++) {
                if (grid[i][j] != 0) cc++; // Increment if a server is found
            }

            if (cc > 1) { // If more than one server is found, they can communicate
                for (int i = 0; i < m; i++) {
                    if (grid[i][j] != 0) grid[i][j] = -1; // Mark servers in this column as communicating
                }     
            }
        }

        // Count all communicating servers
        int ans = 0; // Initialize the count of communicating servers
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == -1) // If marked as communicating
                    ans++;
            }
        }
        return ans; // Return the total count of communicating servers
    }
}