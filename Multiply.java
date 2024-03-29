import java.util.*;
class Multiply{
         public static void main(String[]  args) { 
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter a string");
               String s=sc.nextLine();
            String res="";
            int digit=0;

            for(int i=0;i<s.length();i++){
                   if(Character.isDigit(s.charAt(i))){
                       digit=Character.getNumericValue(s.charAt(i));
                      
                        while(digit!=1){
                            res+=s.charAt(i-1);
                            digit--;
                            
                        }
                   }
                   else{
                       res+=s.charAt(i);
                   }
            }
            System.out.println(res);

         }
}