public class Solution {
    public long numberOfWeeks(int[] milestones) {
        long totalMilestones = 0;
        long maxMilestones = 0;
        
        for (int milestone : milestones) {
            totalMilestones += milestone;
            maxMilestones = Math.max(maxMilestones, milestone);
        }
        
        long otherMilestones = totalMilestones - maxMilestones;
        
        if (maxMilestones > otherMilestones + 1) {
            return 2 * otherMilestones + 1;
        } else {
            return totalMilestones;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
      
        int[] milestones1 = {1, 2, 3};
        System.out.println(solution.numberOfWeeks(milestones1)); 
        
        
        int[] milestones2 = {5, 2, 1};
        System.out.println(solution.numberOfWeeks(milestones2)); 
    }
}
