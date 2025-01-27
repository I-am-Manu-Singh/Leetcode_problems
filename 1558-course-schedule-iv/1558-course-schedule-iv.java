class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] pre, int[][] queries) {
        List<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0; i < numCourses; i++){
            list.add(new ArrayList<>());
        }

        for(int i = 0; i < pre.length; i++){
            list.get(pre[i][0]).add(pre[i][1]);
        }

        List<Boolean> ans = new ArrayList<>();
        for(int i = 0; i < queries.length; i++){
            if(checkIfPre(list, queries[i][0], queries[i][1], new int[numCourses]))
                ans.add(true);
            else
                ans.add(false);
        }

        return ans;

    }

    boolean checkIfPre(List<ArrayList<Integer>> list, int x, int y, int vis[]){

        vis[x] = 3;
        for(int i = 0; i < list.get(x).size(); i++){

            if(list.get(x).get(i) == y)
                return true;
            if(vis[list.get(x).get(i)] == 0){
                boolean result = checkIfPre(list, list.get(x).get(i), y, vis);
                if(result == true)
                    return true;
            }
        }

        return false;

    }
}