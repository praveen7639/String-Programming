import java.util.*;

class ToggleCase{
        public static void main(String[] args){
            String s="Hello World";
            String s1="";
            System.out.println("Original string : "+s);
            for(int i=0;i<=s.length()-1;i++){
                    if(s.charAt(i) >='A' && s.charAt(i) <='Z'){
                          s1+=Character.toLowerCase(s.charAt(i));
                    }
                    else if(s.charAt(i) >='a' && s.charAt(i) <='z'){
                          s1+=Character.toUpperCase(s.charAt(i));
                    }
                    else{
                         s1+=s.charAt(i);
                    }
            }
            System.out.println(s1);
       } 
}