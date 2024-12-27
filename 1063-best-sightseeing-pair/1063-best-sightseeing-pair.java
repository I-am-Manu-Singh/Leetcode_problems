class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int ans = 0;
        int Prev = values[0];

        for (int j = 1; j < values.length; j++) {
            ans = Math.max(ans, Prev + values[j] - j);
            Prev = Math.max(Prev, values[j] + j);
        }

        return ans;
    }
}