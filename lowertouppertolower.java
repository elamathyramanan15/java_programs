import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        int len= s.length();
        for(int i=0;i<len;i++){
            char c = s.charAt(i);
            
            if(c>= 65 && c<=90){
                System.out.print(Character.toLowerCase(c));
            }
            else{
                System.out.print(Character.toUpperCase(c));
            }
            
        }
    }
}