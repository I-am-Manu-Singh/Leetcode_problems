class Solution {
    private int f(int i , int[] days, int[] cost, int[] dp){
        if(i>=days.length){
            return 0;
        }
        if(dp[i] != -1) return dp[i];
        int one = cost[0] + f(i+1, days, cost,dp);

        int j =i;
        while(j<days.length && days[j]-days[i]<7){
            j++;
        }
        int seven = cost[1] + f(j, days, cost,dp);

        j = i;
        while(j<days.length && days[j]-days[i]<30){
            j++;
        }
        int fifteen = cost[2] + f(j, days, cost,dp);

        return dp[i] =  Math.min(one, Math.min(seven, fifteen));
    }
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[days.length];
        Arrays.fill(dp, -1);
        return f(0, days, costs, dp);
    }
}