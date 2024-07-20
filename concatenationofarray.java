public class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
       
        int[] nums1 = {1, 2, 1};
        int[] output1 = solution.getConcatenation(nums1);
        System.out.println(java.util.Arrays.toString(output1));  2, 1, 1, 2, 1]
        
        int[] nums2 = {1, 3, 2, 1};
        int[] output2 = solution.getConcatenation(nums2);
        System.out.println(java.util.Arrays.toString(output2
    }
}
