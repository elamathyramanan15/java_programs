public class Solution {
    public int addRungs(int[] rungs, int dist) {
        int current = 0;
        int additionalRungs = 0;

        for (int rung : rungs) {
            if (rung - current > dist) {
                additionalRungs += (rung - current - 1) / dist;
            }
            current = rung;
        }

        return additionalRungs;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

       
        int[] rungs1 = {1, 3, 5, 10};
        int dist1 = 2;
        System.out.println(solution.addRungs(rungs1, dist1));  

        
        int[] rungs2 = {3, 6, 8, 10};
        int dist2 = 3;
        System.out.println(solution.addRungs(rungs2, dist2));  

        
        int[] rungs3 = {3, 4, 6, 7};
        int dist3 = 2;
        System.out.println(solution.addRungs(rungs3, dist3));  
    }
}
