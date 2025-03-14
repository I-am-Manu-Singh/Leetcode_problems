class Solution {
    public int maximumCount(int[] nums) {
      int n = nums.length;
      int end = n-1;
      int negPosi= binarySearch(nums, 0, end, -1);
      int posPosi= binarySearch(nums, negPosi, end, 0);
      int posCount= (n - posPosi);
      return Math.max(negPosi, posCount);
    }

    public int binarySearch(int nums[], int start, int end, int target){
        while(start <= end) {
            int mid = start+((end-start)/2);
            if(nums[mid] <= target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return start;
    }
}