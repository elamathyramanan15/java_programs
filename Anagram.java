import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String s1 = sc.next().toLowerCase();
        String s2 = sc.next().toLowerCase();
        int l1 = s1.length();
        int l2 = s2.length();
        
        if(l1==l2){
            char c1[]= s1.toCharArray();
            char c2[] = s2.toCharArray();
            int a1[]= new int[256];
            int a2[]= new int[256];
            int ascii;
            for(int i=0;i<l1;i++){
                ascii = (int)c1[i];
                a1[ascii]++;
                ascii=(int)c2[i];
                a2[ascii]++;
            }
            int f=0;
            for(int i=0;i<256;i++){
                if(a1[i]!=a2[i]){
                    f=1;
                    break;
                }
            }
            if(f==0){
                System.out.println("Anagram");
            }
            else{
                System.out.println("not anagram");
            }
        }
        else{
            System.out.println("not");
        }
    }
}