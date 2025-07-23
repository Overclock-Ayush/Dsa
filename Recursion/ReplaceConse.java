public class ReplaceConse{
    public static void main(String args[])
    {
        String res=Operation("AAABBCCDC");
        System.out.println(res);
    }
    static String Operation(String str)
    {
         if(str.length()<=1)
         {
            return str;
         }
      
         String temp=Operation(str.substring(1));
         if(str.charAt(0)==str.charAt(1))
         {
            return temp;
         }
         else{
           temp= str.charAt(0)+temp;
            return temp;
         }
    }
}