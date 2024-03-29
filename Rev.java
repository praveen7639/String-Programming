class Rev{
     public static void main(String[] args){
             String str="gokul",reversed="";
             int len=0;
             for(char x :str.toCharArray()){
                 len++;
             }
             System.out.println(len);

             for(int i=len-1;i>=0;i--){
                  reversed+=str.charAt(i);
             }
             System.out.println(reversed);
     }
}