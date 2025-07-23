

public class Palindrome {
    public static void main(String args[])
    {
        check("MADAM",0);
    }
    public static void check (String str, int i)
    {
        if(i>=(str.length()-1)/2)
        {
            System.out.println("Its Palindrome");
            return;
        }
        if(str.charAt(i)==str.charAt(str.length()-1-i))
        {
            check(str,i+1);
        }
        else{
            System.out.println("Not Palindrome");
            return;
        }


    }

}
