class Solution {
    public int waysToSplitArray(int[] nums) {
        long[] pref=new long[nums.length];
        pref[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pref[i]=pref[i-1]+nums[i];
        }
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(pref[i]>=pref[nums.length-1]-pref[i]) count++;
        }
        return count;
    }
}