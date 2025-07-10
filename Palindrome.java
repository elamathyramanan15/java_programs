import java.util.*;
public class Palindrome{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String S= sc.nextLine();
        char ch[]= S.toCharArray();
        int n= S.length();
        int len = S.length()-1;
        
        char t;
        
        for(int i=0;i<=n/2; i++){
            t=ch[i];
            ch[i]= ch[len];
            ch[len]= t;
            len--;
        }
           String r =new String(ch);
           
           if(S.equals(r)){
               System.out.println("Palindrome");
           }
           else{
               System.out.println("Not a Palindrome");
           }
          
    }
}