import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        
      
      
        while(sc.hasNext()){
            
            String s1=sc.next();
            int n=sc.nextInt();
            String formatedString=s1;
            int line = formatedString.length();
            while(formatedString.length()<15){
                formatedString +=" ";
            }
            
             String s2=Integer.toString(n);
             while(s2.length()<3){
                 s2="0"+s2;
             }
             System.out.println(formatedString+s2);
                        } 
 System.out.println("================================");
    }}
    
