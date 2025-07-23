public class ReplaceHiWithHello {
    public static void main(String args[])
    {
        String result=Operation("Hi Ayush Hi Amit");
        System.out.println("New String is :"+result);
    }
    static String Operation(String str)
    {
        if(str.length()<=1)
        {
            return str;
        }
        if(str.charAt(0)=='H' && str.charAt(1)=='i')
        {
           String result= Operation(str.substring(2));
          return result="Hello"+result;
           
        }
        else{
            String result=Operation(str.substring(1));
            return  result=str.charAt(0)+result;
        }
    }

}
