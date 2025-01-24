class Solution {
    public int[][] highestPeak(int[][] isWater) {

        int m = isWater.length, n = isWater[0].length;

        int ans[][] = new int[m][n];
        Queue<int[]> pq = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isWater[i][j] == 1) {
                    pq.offer(new int[] { i, j });
                } else {
                    ans[i][j] = -1;
                }
            }
        }

        int dir[][] = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
        int count = 1;

        while (!pq.isEmpty()) {
            int size = pq.size();

            for (int i = 1; i <= size; i++) {

                int ar[] = pq.poll();

                for (int di[] : dir) {
                    int x = ar[0] + di[0];
                    int y = ar[1] + di[1];

                    if (x >= 0 && x < m && y >= 0 && y < n && ans[x][y] == -1) {
                        ans[x][y] = count;
                        pq.offer(new int[] { x, y });
                    }
                }
            }
            count++;
        }

        return ans;
    }
}