public class StrongNumber {
    public static void main(String args[])
    {
        Operation(145,0,145);
    }
    static void Operation(int num,int sum,int cpy)
    {
        if(num==0)
        {
            if(sum==cpy)
            {
                System.out.println("Strong Number");
            }
            else{
                System.out.println("Not Strong Number");
            }
            return;
        }
        int dig=num%10;
        sum=sum+factorial(dig,1);
        Operation(num/10, sum,cpy);
    }
    static int factorial(int num,int sum)
    {
        if(num==0)
        {
            return sum;
        }
        
        return factorial(num-1,sum*num);
    }

}
