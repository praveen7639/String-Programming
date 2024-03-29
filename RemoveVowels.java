class RemoveVowels{
       public static void main(String[] args){
             String s1="rsedtrfuutgjhk";
             System.out.println("Original string : "+s1);
             String s2="aeiouAEIOU";
             for(int i=0;i<s2.length();i++){
                    s1=s1.replaceAll(String.valueOf(s2.charAt(i)),"");
             }
             System.out.println(s1);
       }
}