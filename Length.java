import java.util.*;

class Length{
      public static void main(String[] args){
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter a String");
           String str1 =sc.nextLine(); 
           int length=0; 
           char[] ch=str1.toCharArray();
         
            for(char x:ch){
                   length++;
            }
                System.out.println(length);
      }}