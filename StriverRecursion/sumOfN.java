

public class sumOfN {
    public static void main(String args[])
    {
       int res= printSum(5);
       System.out.println("Result is :"+res);
    }
    static int  printSum(int num)
    {
        if(num==0)
        {
            return 0;
        }
        int sum=num+printSum(num-1);
        return sum;

    }

}
