import java.util.*;
public class Ducknumber{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int count=0;
        String s = sc.nextLine();
        
           if(s.charAt(0)=='0'){
               System.out.println("Not a Duck number");
       }
       else{
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='0'){
               count++;
           }
         }
      
      if(count>0){
          System.out.println("Duck number");
      }
      else{
          System.out.println("Not a Duck number");
      }
    }
        
    }
}