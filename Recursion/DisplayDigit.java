public class DisplayDigit {
    static void print(int num)
    {
        if(num==0)
        {
            return;
        }
        print(num/10);
        System.out.println(num%10);
    }
    public static void main(String args[])
    {
        print(12345);
    }
    

}
