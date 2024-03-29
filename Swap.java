import java.util.*;
public class Swap{

    public static void main(String[] args){
           
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter first String");
            String s1 =sc.nextLine(); 
            System.out.println("Enter second String");
            String s2 =sc.nextLine();

            s1=s1+s2;
            s2=s1.substring(0,s1.length()-s2.length());
            s1=s1.substring(s2.length(),s1.length());

            System.out.println(s1);
            System.out.println(s2);
                   }
}