class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        int len = queries.length;
        int val = Integer.MIN_VALUE;
        Arrays.sort(items,Comparator.comparingInt(a -> a[0]));
        for(int i = 0;i < items.length;i++){
            val = Math.max(val,items[i][1]);
            items[i][1] = val;
        }
        for(int i = 0;i < len;i++){
            queries[i] = binarySearch(items,queries[i]);
        }
        return queries;
    }
    public int binarySearch(int[][] items, int tar){
        int end = items.length-1;
        int start = 0;
        while(start <= end){
            int mid = start+((end-start)/2);
            if(items[mid][0] <= tar){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return start-1 == -1 ? 0 : items[start-1][1];
    }
}