import java.util.*;

class LeftRotate{
       public static void main(String[] args){
                   Scanner sc=new Scanner(System.in);
                   String s=sc.nextLine();
                   char[] ch=s.toCharArray();
                   int n=sc.nextInt();
                   char first;
                   String ans="";

                   for(int i=0;i<n;i++){
                     first=ch[0];
                        for(int j=0;j<ch.length-1;j++){
                               ch[j]=ch[j+1];
                        }
                        ch[ch.length-1]=first;
                   }

                   for(int k=0;k<ch.length;k++){
                           System.out.print(ch[k]+",");
                   }




       }
}