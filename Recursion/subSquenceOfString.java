public class subSquenceOfString{
    public static void main(String args[])
    {
        Operation("abc","");
    }
    static void Operation(String str, String result)
    {
        if(str.length()==0)
        {
            System.out.print(result+",");
            return;
        }
        Operation(str.substring(1),result); //Not Taken on left side of a String
        Operation(str.substring(1),result+str.charAt(0));

    }
}