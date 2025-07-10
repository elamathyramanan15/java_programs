import java.util.*;
public class StrongNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact =1;
        int sum = 0;
        int temp = n;
        while(n > 0){
            int digit = n % 10;
            fact = 1;
            for(int i = 1; i <= digit; i++){
                fact *= i;
            }
            sum += fact;
            n /= 10;
            //System.out.print(n);
        }
        if(sum == temp){
            System.out.println("Strong number");
        }else{
            System.out.println("Not a strong number");
        }
    }
}