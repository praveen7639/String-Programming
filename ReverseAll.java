import java.util.*;

class ReverseAll{
      public static void main(String[] args){
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter a sentence");
             String s1=sc.nextLine();
             String[] splitted=s1.split(" ");
              
             String ans="";

             for(int i=splitted.length-1;i>=0;i--){
                   ans+=rev(splitted[i])+" ";
             }

             System.out.println(ans);                                                                                                                                                                                                                                       
      }

      public static String rev(String s){
                 String r="";

                 for(int i=s.length()-1;i>=0;i--){
                        r+=s.charAt(i);
                 }
                 return r;
      }
}