public class TreeRecursion {
    public static void main(String args[])
    {
        printNum(4);
    }
    static void printNum(int num)
    {
        if(num<=0)
        {
            return;
        }
        System.out.println("Pre Call"+num);
        printNum(num-1);
        System.out.println("In b/w Call"+num);
        printNum(num-2);
        System.out.println("Post Call"+num);
    }

}
