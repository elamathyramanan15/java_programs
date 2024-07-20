import java.util.*;

public class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int n = times.length;
        
        
        List<int[]> events = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            events.add(new int[]{times[i][0], 1, i}); // 1 means arrival
            events.add(new int[]{times[i][1], 0, i}); // 0 means departure
        }
        
       
        events.sort((a, b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));
        
        PriorityQueue<Integer> availableChairs = new PriorityQueue<>();
        Map<Integer, Integer> friendToChair = new HashMap<>();
        
       
        for (int i = 0; i < n; i++) {
            availableChairs.add(i);
        }
        
       
        for (int[] event : events) {
            int time = event[0];
            int type = event[1];
            int friend = event[2];
            
            if (type == 1) { 
                int chair = availableChairs.poll();
                friendToChair.put(friend, chair);
                if (friend == targetFriend) {
                    return chair;
                }
            } else { 
                int chair = friendToChair.get(friend);
                availableChairs.add(chair);
            }
        }
        
        return -1; 
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
       
        int[][] times1 = {{1, 4}, {2, 3}, {4, 6}};
        int targetFriend1 = 1;
        System.out.println(solution.smallestChair(times1, targetFriend1)); // Output: 1
        
       
        int[][] times2 = {{3, 10}, {1, 5}, {2, 6}};
        int targetFriend2 = 0;
        System.out.println(solution.smallestChair(times2, targetFriend2)); // Output: 2
    }
}
