import java.util.*;

class Frequency{
           public static void main(String[] args){
               Scanner sc=new Scanner(System.in);
                 System.out.println("Enter A String");
                 String s=sc.nextLine();
                //  int[] freq=new int[s.length()];
                 char[] ch=s.toCharArray();


                 for(int i=0;i<ch.length;i++){
                        int freq=1;
                       for(int j=i+1;j<ch.length;j++){
                              if(ch[i]==ch[j]){
                                  freq++;
                                  ch[j]=' ';
                              }
                       }
                       if(ch[i]!=' '){
                           System.out.println(ch[i]+" occurs "+freq+" times");
                       }
                                
                 }

                //  for(int i=0;i<ch.length;i++){
                //           if(ch[i]!=' '){
                //              System.out.println((char)ch[i]+" : "+freq[i]);
                //  }
                //  }
           }
}