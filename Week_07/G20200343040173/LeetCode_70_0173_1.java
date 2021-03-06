/**
 * 70. 爬楼梯
 *  假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
    每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

    注意：给定 n 是一个正整数。

    示例 1：

    输入： 2
    输出： 2
    解释： 有两种方法可以爬到楼顶。
    1.  1 阶 + 1 阶
    2.  2 阶
    示例 2：

    输入： 3
    输出： 3
    解释： 有三种方法可以爬到楼顶。
    1.  1 阶 + 1 阶 + 1 阶
    2.  1 阶 + 2 阶
    3.  2 阶 + 1 阶
 * 
 * 复杂度分析

    时间复杂度：O(n)，单循环到 n 。
    空间复杂度：O(n)，dp 数组用了 n 的空间。
 * 
 * 动态规划法：
 *   最优子结构性质：它的最优解可以从其子问题的最优解来有效地构建
 *   储存中间状态：dp[i]
 *   递推公式（状态转移方程或者 DP 方程）：dp[i]=dp[i−1]+dp[i−2]
 */
class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}