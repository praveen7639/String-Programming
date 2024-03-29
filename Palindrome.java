import java.util.*;

class Palindrome{
       public static void main(String[] args){
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter a string:");
           String s1=sc.nextLine();

           String rev="";

            for(int i=s1.length()-1;i>=0;i--){
                  rev+=s1.charAt(i);
            }
            // System.out.println(rev);
           if(rev.equals(s1)){
                System.out.println("Palindrome");
           }
           else{
                System.out.println("Not a Palindrome");
           }
           
       }
}