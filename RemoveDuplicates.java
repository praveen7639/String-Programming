import java.util.*;

class RemoveDuplicates{
        public static void main(String[] args){
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter a String");
               String s=sc.nextLine();
               String newstr="";
                
              for(int i=0;i<s.length();i++){
                     if(newstr.indexOf(s.charAt(i)) < 0){
                          newstr+=s.charAt(i);
                     }  
              }
              System.out.println(newstr);
        }
}