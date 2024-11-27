class Solution {
    public int climbStairs(int n) {
        int w0 = 1; // when n == 0 then there is one way
        int w1 = 1; // when n == 1 then there is one way

        for (int i = 2; i < n + 1; i++) {
            // total ways-->tW
            int tW = w0 + w1;
            w0 = w1;
            w1 = tW;
        }
        return w1;
    }
}