package com.yudao.leetcode.dynamic;

/**
 * 198. 打家劫舍
 */
public class Leet198_Rob {

    public static void main(String[] args) {

        int [] nums = new int[] {2,7,9,3,1};

        Leet198_Rob r = new Leet198_Rob();
        System.out.println(r.rob(nums));

    }

    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i <= nums.length; i++) {
            dp[i] = Math.max(dp[i-1],dp[i-2] + nums[i-1]);
        }
        return dp[nums.length];
    }


}
