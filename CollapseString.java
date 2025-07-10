import java.util.*;
public class CollapseString{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println("String: "+s);
        
        String res = "";
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(res.length()>0 && res.charAt(res.length()-1)==ch){
                res= res.substring(0,res.length()-1);
            }
            else{
                res+=ch;
            }
        }
        
        if(res.length()==0){
            System.out.println("Empty String");
        }
        else{
            System.out.println(res);
        }
    }
}