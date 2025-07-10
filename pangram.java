import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        
        for(char ch='a'; ch<='z'; ch++){
            if(s.indexOf(ch)!=-1){
                count++;            }
        }
    if(count==26){
        System.out.println("pangram");
    }
    else{
        System.out.println("not a pangram");
        }
    }
}