import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Solution {
    public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
        int n = obstacles.length;
        int[] result = new int[n];
        
        
        List<Integer> dp = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int obstacle = obstacles[i];
            
            int pos = binarySearch(dp, obstacle);
            
            if (pos < dp.size()) {
                dp.set(pos, obstacle);
            } else {
                dp.add(obstacle);
            }
            
            result[i] = dp.size();
        }
        
        return result;
    }
    
    private int binarySearch(List<Integer> dp, int target) {
        int left = 0;
        int right = dp.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (dp.get(mid) <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right + 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        
        int[] obstacles1 = {1, 2, 3, 2};
        int[] result1 = solution.longestObstacleCourseAtEachPosition(obstacles1);
        for (int r : result1) {
            System.out.print(r + " ");
        }
        System.out.println(); 
        
        
        int[] obstacles2 = {2, 2, 1};
        int[] result2 = solution.longestObstacleCourseAtEachPosition(obstacles2);
        for (int r : result2) {
            System.out.print(r + " ");
        }
        System.out.println(); 
        
        
        int[] obstacles3 = {3, 1, 5, 6, 4, 2};
        int[] result3 = solution.longestObstacleCourseAtEachPosition(obstacles3);
        for (int r : result3) {
            System.out.print(r + " ");
        }
        System.out.println(); 
    }
}
