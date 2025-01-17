class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int XOR = 0;

        if(m % 2 != 0) {
            for(int num : nums2) {
                XOR ^= num;
            }
        }


        if(n % 2 != 0) {
            for(int num : nums1) {
                XOR ^= num;
            }
        }
        return XOR;
    }
}