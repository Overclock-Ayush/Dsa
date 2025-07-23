public class Fibonacci {
 public static void main(String args[])
 {
     int res=printFibo(8);
     System.out.println("Fibo is: "+res);
 }
 static int printFibo(int num)
 {
    if(num<=1)
    {
        return num;
    }
    int FirstTerm=printFibo(num-1);
    int SecondTerm=printFibo(num-2);
    return FirstTerm+SecondTerm;
 }
}
