import java.util.*;

class Duplicate{
       public static void main(String[] args){
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the String");
              String s=sc.nextLine();
              char[] ch=s.toCharArray();

               for(int i=0;i<ch.length;i++){
                     int count=1;
                        for(int j=i+1;j<ch.length;j++){
                              if(ch[i]==ch[j] && ch[i]!=' '){
                                   count++;
                                    ch[j]=' ';
                              }
                        }
                        if(count>1){
                   System.out.println(ch[i]+"-"+count);  
               }
               }
       }
}