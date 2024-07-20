public class Solution {
    public int minSpaceWastedKResizing(int[] nums, int k) {
        int n = nums.length;
        int[][] dp = new int[n][k + 1];
        int INF = (int) 1e9;

       
        for (int[] row : dp) {
            Arrays.fill(row, INF);
        }
        
        
        dp[0][0] = 0;
        
      
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= k; j++) {
                if (i > 0) {
                    dp[i][j] = dp[i-1][j];
                }
                int max = 0;
                int sum = 0;
                for (int start = i; start >= 0; start--) {
                    max = Math.max(max, nums[start]);
                    sum += nums[start];
                    if (j > 0 && start > 0) {
                        dp[i][j] = Math.min(dp[i][j], dp[start-1][j-1] + max * (i - start + 1) - sum);
                    } else if (start == 0) {
                        dp[i][j] = Math.min(dp[i][j], max * (i - start + 1) - sum);
                    }
                }
            }
        }
        
        int result = INF;
        for (int j = 0; j <= k; j++) {
            result = Math.min(result, dp[n-1][j]);
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        
        int[] nums1 = {10, 20};
        int k1 = 0;
        System.out.println(solution.minSpaceWastedKResizing(nums1, k1)); // Output: 10
        
        
        int[] nums2 = {10, 20, 30};
        int k2 = 1;
        System.out.println(solution.minSpaceWastedKResizing(nums2, k2)); // Output: 10
        
        
        int[] nums3 = {10, 20, 15, 30, 20};
        int k3 = 2;
        System.out.println(solution.minSpaceWastedKResizing(nums3, k3)); // Output: 15
    }
}
