public class Palindrome {
     static boolean Palindrome(int num,int reverse,int cpy)
     {
        if(num==0)
        {
            return reverse==cpy;
        }
        int dig=num%10;
        reverse=reverse*10+dig;
        return Palindrome(num/10,reverse,cpy);
     }
   
   
   
    static void PalindromeCheck(int num,int reverse,int cpy)
    {
        if(num==0)
        {
            if(cpy==reverse)
            {
                System.out.println("Its Palindrome");
            }
            else{
            System.out.println("Its not Palindrome");
        }
        return;
        }
        int dig=num%10;
        reverse=reverse*10+dig;
        PalindromeCheck(num/10, reverse, cpy);

        
    }
    public static void main(String args[])
    {
        int num=1551;
        int cpy=num;
        PalindromeCheck(num,0,cpy);
        boolean ans=Palindrome(num, 0, cpy);
        System.out.println(ans ?"Palindrome" :"Non Palindrome");
    }

}
