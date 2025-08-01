class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];

        // Base cases
        dp[0] = 0;
        dp[1] = 0;

        // Build up the dp array
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(
                dp[i - 1] + cost[i - 1],
                dp[i - 2] + cost[i - 2]
            );
        }

        return dp[n]; // Minimum cost to reach the top
    }
}
