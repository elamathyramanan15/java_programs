public class Solution {
    public String maximumNumber(String num, int[] change) {
        char[] numArray = num.toCharArray();
        boolean started = false;
        
        for (int i = 0; i < numArray.length; i++) {
            int digit = numArray[i] - '0';
            int newDigit = change[digit];
            
            if (newDigit > digit) {
                numArray[i] = (char) (newDigit + '0');
                started = true;
            } else if (newDigit < digit && started) {
                break;
            }
        }
        
        return new String(numArray);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
    
        String num1 = "132";
        int[] change1 = {9, 8, 5, 0, 3, 6, 4, 2, 6, 8};
        System.out.println(solution.maximumNumber(num1, change1)); 
        
      
        String num2 = "021";
        int[] change2 = {9, 4, 3, 5, 7, 2, 1, 9, 0, 6};
        System.out.println(solution.maximumNumber(num2, change2)); 
        
       
        String num3 = "5";
        int[] change3 = {1, 4, 7, 5, 3, 2, 5, 6, 9, 4};
        System.out.println(solution.maximumNumber(num3, change3)); 
    }
}
