import java.util.*;

class Anagram {
       public static void main(String[] args){
             Scanner sc=new Scanner(System.in);
              System.out.println("Enter 1st String");
               String s1=sc.nextLine();
              System.out.println("Enter 2nd String");
              String s2=sc.nextLine();

              if(isAnagram(s1,s2)){
                    System.out.println("The strings are anagrams of each other");
              }
               else{
                    System.out.println("no");
               }
       }

       public static boolean  isAnagram(String s1,String s2) {
                  
                    s1=s1.replaceAll(" ","");
                    s2=s2.replaceAll(" ","");

                    if(s1.length()!=s2.length()){
                          return false;
                    }
                    else{
                         char[] arr1=s1.toLowerCase().toCharArray();
                         char[] arr2=s2.toLowerCase().toCharArray();

                          Arrays.sort(arr1);
                          Arrays.sort(arr2);

                          return Arrays.equals(arr1,arr2);
                    }
                 
       }
}