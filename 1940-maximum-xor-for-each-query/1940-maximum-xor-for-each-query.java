class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int xorVal = 0;
        int togglePoint = (1 << maximumBit) - 1; 
        for (int x : nums) {
            xorVal ^= x;
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = xorVal ^ togglePoint;
            xorVal ^= nums[n - 1 - i];
        }

        return ans;
    }
}
