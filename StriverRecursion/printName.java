
public class printName {
    public static void main(String args[])
    {
        print(1,5);
    }
    static void print(int i, int num)
    {
        if(i>num)
        {
            return;
        }
        
        print(i+1,num);
        System.out.println(i);
        }

}
