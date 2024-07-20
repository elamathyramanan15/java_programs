public class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder prefix = new StringBuilder();
        
        for (String word : words) {
            prefix.append(word);
            if (prefix.toString().equals(s)) {
                return true;
            }
            if (prefix.length() > s.length() || !s.startsWith(prefix.toString())) {
                return false;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        
        String s1 = "iloveleetcode";
        String[] words1 = {"i", "love", "leetcode", "apples"};
        System.out.println(solution.isPrefixString(s1, words1)); // Output: true
        
      
        String s2 = "iloveleetcode";
        String[] words2 = {"apples", "i", "love", "leetcode"};
        System.out.println(solution.isPrefixString(s2, words2)); // Output: false
    }
}
