class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[n];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                boolean flag = true;
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                visited[i] = true;
                int elem = 0, size = -1;

                while (!q.isEmpty()) {
                    elem++;
                    int node = q.poll();
                    if (size == -1) {
                        size = adj.get(node).size();
                    }
                    if (size != adj.get(node).size()) {
                        flag = false;
                    }
                    for (int j : adj.get(node)) {
                        if (!visited[j]) {
                            visited[j] = true;
                            q.add(j);
                        }
                    }
                }

                if (flag && size == elem - 1) {
                    ans++;
                }
            }
        }
        return ans;
    }
}