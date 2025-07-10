import java.util.*;
public class OddEvenSum{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        int s1=0,s2=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                s1 +=a[i];
            }
            else{
                s2 +=a[i];
            }
        }
        System.out.println("Sum of odd numbers:" + s2);
        System.out.println("Sum of even numbers:"+s1);
    }
}