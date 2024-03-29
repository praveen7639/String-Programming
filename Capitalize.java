import java.util.*;

class Capitalize{
       public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            String res="";
            

            String[] splitted=s.split(" ");

              for(int i=0;i<splitted.length;i++){
                String start="",end="",mid="";

                start =splitted[i].substring(0,1).toUpperCase();
                mid=splitted[i].substring(1,splitted[i].length()-1).toLowerCase();
                end=splitted[i].substring(splitted[i].length()-1).toUpperCase();
                splitted[i]=start+mid+end;
              }

              for(int j=0;j<splitted.length;j++){
                       System.out.print(splitted[j]+" "); 
              }
       }
}                                                                                                                                                                                                                                                                                                                                                   