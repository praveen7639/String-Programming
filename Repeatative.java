import java.util.*;

class Repeatative{
       public static void main(String[] args){
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter A String");
             String s=sc.nextLine();
              char ch[]=s.toCharArray();
              boolean flag=true;
            
             
             for(int i=0;i<ch.length;i++){
                   
                   if(s.indexOf(ch[i])==s.lastIndexOf(ch[i])){
                            System.out.print(ch[i]+" ");   
                            flag=false;                       
                   }
          
             }
             if(flag){
                   System.out.print("no non repeatative characters");
             }
       }
}