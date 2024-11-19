class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        long sum=0;
        long max=0;
        int[] arr=new int[100001];
        int dupCount=0;


        for(int i=0; i<k-1; i++){
            sum+=nums[i];
            if(arr[nums[i]]>=1){
                dupCount++;
            }
            arr[nums[i]]++;
        }

        int prev=0;
        for(int i=k-1; i<n; i++){
            sum+=nums[i]-prev;
            
            if(arr[nums[i]]>=1){
                dupCount++;
            }
            arr[nums[i]]++;

            if(dupCount==0){                
                max=Math.max(max, sum);
            }

            prev=nums[i-(k-1)];
            if(arr[prev]>1){
                dupCount--;                
            }
            arr[prev]--;            
        }

        return max;
    }
}