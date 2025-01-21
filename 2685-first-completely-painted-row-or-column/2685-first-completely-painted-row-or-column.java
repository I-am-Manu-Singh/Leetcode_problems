class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int rows[]=new int[n];
        int cols[]=new int[m];
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                ArrayList<Integer> list=new ArrayList<>();
                list.add(i);
                list.add(j);
                hm.put(mat[i][j],list);
            }

        }
        for(int i=0;i<arr.length;i++){
            int ind1=hm.get(arr[i]).get(0);
            int ind2=hm.get(arr[i]).get(1);
            rows[ind1]++;
            cols[ind2]++;
            if(rows[ind1]>=m)
            return i;
           if(cols[ind2]>=n)
           return i;
        }
        return 0;
    }
}