public class Fibonacci {
    public static void main(String args[])
    {
        int res=Fibo(3);
        System.out.println("Fibonacci number is :"+res);
    }
    public static int Fibo(int num)
    {
        if(num<=1)
        {
            return num;
        }
        int last=Fibo(num-1);
        int sLast=Fibo(num-2);
        return last+sLast;

    }

}
