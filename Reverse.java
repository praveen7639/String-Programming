import java.util.*;

class Reverse{
      public static void main(String[] args){
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter a String");
            String s1=sc.nextLine();
             
            int n=s1.length();
            
		
            String rev="";

            for(int i=n-1;i>=0;i--){
                  rev+=s1.charAt(i);
            }
            System.out.println(rev);
      }
}