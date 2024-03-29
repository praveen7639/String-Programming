import java.util.*;

public class LeadingZero{
       public static void main(String[] args){
           Scanner sc=new Scanner(System.in);
           int num=sc.nextInt();
           int rem=0,rev=0;

           while(num!=0){
                 rem=num%10;
                 rev=rev*10+rem;
                 num/=10;
           }
           String str=Integer.toString(rev);
            str=str.replaceAll("^0+(?!$)","");
            int result=Integer.parseInt(str);
            System.out.println(result);
       }
}