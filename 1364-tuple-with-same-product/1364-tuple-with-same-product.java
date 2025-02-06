class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int len = nums.length;

        for(int i = 0; i < len; i++)
        {
            for(int j = i+1; j < len; j++)
            {
                int val = nums[i] * nums[j];
                map.put(val, map.getOrDefault(val, 0) + 1);
            }
        }

        int ans = 0;


        for(int i: map.keySet())
        {
            int val = map.get(i);
            ans = ans + (val * (val-1)) / 2 * 8;
        }
        return ans;
    }
}