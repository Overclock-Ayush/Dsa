public class SubString {
    public static void main(String args[])
    {
        printSubString("abc"," ");
    }
    static void printSubString(String str, String result)
    {
        if(str.length()==0)
        {
            System.out.print(result+" ,");
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char currentString=str.charAt(i);
            String remString=str.substring(0, i)+str.substring(i+1);
            printSubString(remString, result+currentString);
            
        }
        

    }

}
