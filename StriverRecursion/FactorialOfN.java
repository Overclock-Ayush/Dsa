

public class FactorialOfN {
    public static void main(String[] args) {
        System.out.println("Factorial of N number is :"+Fact(5));
    }
    static int Fact(int num)
    {
        if(num==0)
        {
            return 1;
        }
        int res=num*Fact(num-1);
        return res;
    }

}
