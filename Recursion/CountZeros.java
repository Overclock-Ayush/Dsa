 public class CountZeros {
    public static void main(String args[])
    {   int num=10200;
        System.out.println("Count of number is:"+countNum(num));
        System.out.println("Number os zeros in number is :"+Operation(num));
    }
    static int countNum(int num)
    {
        if(num==0)
        {
            return 0;
        }
        int res=countNum(num/10);
        return res+1;

    }
    static int Operation(int num)
    {
        if(num==0)
        {
            return 0;
        }
        
         int count=Operation(num/10);
         int dig=num%10;
         if(dig==0)
         {
            count++;
         }
         return count;

        
        
    }

}
