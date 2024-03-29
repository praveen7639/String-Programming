import java.util.*;

class CountVowels{
      public static void main(String[] args){
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter a string:");
           String s1=sc.nextLine();
           s1.toLowerCase();
          int count=0;
           for(int i=0;i<s1.length()-1;i++){
                switch(s1.charAt(i)){
                     case 'a':
                     case 'e':
                     case 'i':
                     case 'o':
                     case 'u':
                         count++;
                         break;
                }
           }
           System.out.println(count);
      }
}