import java.util.*;
public class Neonnumber{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        
        int sqr = n*n;
        int sum=0;
        
        while(sqr>0){
            int remainder = sqr%10;
            sum +=remainder;
            sqr /= 10;
        }
        if(sum==n){
            System.out.println("Neon Number");
        }
        else{
            System.out.println("Not a Neon number");
        }
    }
}