public class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            p.add(nums[nums.length - i - 1]);
        }
        long score = 0;
        while (k != 0) {
            int v1 = p.poll();
            score += v1;
            int v2 = (int) Math.ceil((double) v1 / 3);
            p.add(v2);
            k--;
        }
        return score;
    }
}