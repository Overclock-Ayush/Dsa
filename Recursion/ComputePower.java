public class ComputePower{
    public static void main(String args[])
    {
        Power(2,5,1);
        System.out.println("Result using int is :"+Power(2,3));

    }
    static void Power(int num,int pow,int ans)
    {
        if(pow==0)
        {
            System.out.println("Result is :"+ans);
            return;
        }
        Power(num,pow-1,num*ans);
    }
    static int Power(int num,int pow)
    {
        if(pow==1)
        {
            return num; 
        }
        int result=Power(num,pow-1);
        return result*num;
    }
}