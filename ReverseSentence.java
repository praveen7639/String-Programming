import java.util.*;

 class ReverseSentence{
        public static void main(String[] args){
                  Scanner sc=new Scanner(System.in);
                  System.out.println("Enter the sentence");
                  String s1=sc.nextLine();
                  String ans="";
                  String splitted[]=s1.split(" ");

                  for(int i=splitted.length-1;i>=0;i--){
                          ans+=splitted[i]+" ";
                  }

                  System.out.println(ans);
        }
 }