public class StringSearchAndReplace{
    public static void main(String args[])
    {
        String res=Operation("Hello lolly",'l','x');
        System.out.println(res);
    }
    static String Operation(String str,char search,char replace)
    {
        if(str.length()==0)
        {
            return " ";
        }
        String result=Operation(str.substring(1),search, replace);
        if(str.charAt(0)==search)
        {
            return 'x'+result;
        }
        else{
            return str.charAt(0)+result;
        }
    }
}
