public class Pattern{
    public static void main(String args[])
    {
        printPattern(5);
    }
    static void printPattern(int num)
    {
        if(num==0)
        {
            return;
        }
        printPattern(num-1);
        printStar(num);
        System.out.println();
    }
    static void printStar(int star)
    {
        if(star==0)
        {
            return;
        }
        System.out.print("* ");
        printStar(star-1);
    }
}