class Solution {
    public boolean isArraySpecial(int[] nums) {
        int len = nums.length;
        if(len == 1)
        {
            return true;
        }
        for(int i = 1; i < len; i++)
        {
            if((nums[i] % 2) == (nums[i-1] % 2))
            {
                return false;
            }
        }
        return true;
    }
}