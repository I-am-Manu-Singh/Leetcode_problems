class Solution {
    public int findMaxFish(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int maxi = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0) {
                    boolean vis[][] = new boolean[m][n];
                    int a[] = new int[1];
                    dfs(grid, i, j, m, n, a, vis);
                    maxi = Math.max(maxi, a[0]);
                }
            }
        }
        return maxi;
    }
    private void dfs(int grid[][], int i, int j, int m, int n, int a[], boolean vis[][]) {
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 0 || vis[i][j]) {
            return;
        }
        vis[i][j] = true;
        a[0] += grid[i][j];
        dfs(grid, i + 1, j, m, n, a, vis);
        dfs(grid, i, j + 1, m, n, a, vis);
        dfs(grid, i, j - 1, m, n, a, vis);
        dfs(grid, i - 1, j, m, n, a, vis);
    }
}