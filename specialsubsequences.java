public class Solution {
    public int countSpecialSubsequences(int[] nums) {
        long mod = 1_000_000_007;
        long count0 = 0, count1 = 0, count2 = 0;

        for (int num : nums) {
            if (num == 0) {
                count0 = (count0 * 2 + 1) % mod;
            } else if (num == 1) {
                count1 = (count1 * 2 + count0) % mod;
            } else if (num == 2) {
                count2 = (count2 * 2 + count1) % mod;
            }
        }

        return (int) count2;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = {0, 1, 2, 2};
        System.out.println(solution.countSpecialSubsequences(nums1)); 
        
        
        int[] nums2 = {2, 2, 0, 0};
        System.out.println(solution.countSpecialSubsequences(nums2)); 
        
        
        int[] nums3 = {0, 1, 2, 0, 1, 2};
        System.out.println(solution.countSpecialSubsequences(nums3)); 
    }
}
