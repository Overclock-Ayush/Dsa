public class BinaryToDecimal{
    public static void main(String args[])
    {
        System.out.println("Binary to Decimal number is :"+Operation(1010,0,0));
    }
    static int Operation(int num,int pow,int sum)
    {
        if(num==0)
        {
            return sum;
        }
        int lastDigit=num%10;
        sum=sum+(lastDigit*(int)Math.pow(2,pow));
        return Operation(num/10,pow+1,sum);
    }
}