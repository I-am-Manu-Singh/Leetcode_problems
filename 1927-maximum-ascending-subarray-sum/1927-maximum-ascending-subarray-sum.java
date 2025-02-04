class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxi = 0, cursum = 0;
        int len = nums.length;

        if(len == 1)
        {
            return nums[0];
        }

        for(int i = 0; i < len - 1; i++){
            cursum += nums[i];
            if(nums[i] >= nums[i+1])
            {
                maxi = Math.max(maxi, cursum);
                cursum = 0;
            }
        }

        if(nums[len-1] > nums[len-2])
        {
            cursum += nums[len-1];
            maxi = Math.max(maxi, cursum);
        }

        return maxi;
    }
}