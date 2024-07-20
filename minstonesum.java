import java.util.PriorityQueue;
import java.util.Collections;

public class Solution {
    public int minStoneSum(int[] piles, int k) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
       
        for (int pile : piles) {
            maxHeap.offer(-pile);
        }
        
        
        for (int i = 0; i < k; i++) {
            int maxPile = -maxHeap.poll(); 
            int removeStones = maxPile / 2; 
            int updatedPile = maxPile - removeStones; 
            maxHeap.offer(-updatedPile); 
        }
        
        
        int remainingStones = 0;
        while (!maxHeap.isEmpty()) {
            remainingStones += -maxHeap.poll(); 
        }
        
        return remainingStones;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        
        int[] piles1 = {5, 4, 9};
        int k1 = 2;
        System.out.println(solution.minStoneSum(piles1, k1)); 
        
        int[] piles2 = {4, 3, 6, 7};
        int k2 = 3;
        System.out.println(solution.minStoneSum(piles2, k2)); 
    }
}
