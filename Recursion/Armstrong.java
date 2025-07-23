public class Armstrong{
    public static void main(String args[])
    {
        Operation(153,0,153,countNum(153));
    }
    static void Operation(int num,int sum,int cpy,int pow)
    {
        if(num==0)
        {
            if(sum==cpy)
            {
                System.out.println("Armstrong");
            }
            else{
                System.out.println("Non Armstrong");
            }
            return;
        }
        
        int digit=num%10;
        sum=sum+(int)Math.pow(digit,pow);
        Operation(num/10,sum,cpy,pow);

    }
    static int countNum(int num)
    {
        if(num==0)
        {
            return 0;
        }
        int count=countNum(num/10);
        return count + 1;
    }
}
