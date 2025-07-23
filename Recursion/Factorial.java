public class Factorial {
    public static void main(String args[])
    {
        fact(5,1);
        System.out.println("Factorial of a number using int :"+fact2(6,1));
    }
    static void fact(int num,int result)
    {
        if(num==0)
        {
            System.out.println("Factorial is :"+result);
            return;
        }
        fact(num-1,result*num);
    }
    static int fact2(int num,int result)
    {
        if(num==0)
        {
            return result;
        }
         return fact2(num-1,result*num);
        

    }

}
