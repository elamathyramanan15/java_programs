import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        char ch[]= s.toCharArray();
        char c= sc.nextLine().charAt(0);
        int count=0;
        int len= s.length();
        
        for(int i=0;i<len;i++){
            if(s.charAt(i)==c){
                count++;
            }
        }
        System.out.println(count);
    }
}