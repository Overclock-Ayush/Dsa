public class printName {
    static void print(int num)
    {
        if(num==0)
        {
            return;
        }
        System.out.println("Hello my name is Ayush "+num);  //StackBuilding or Tail Recursion 
        print(num-1);
        System.out.println("Sahu "+num); // StackFalling or Head Recursion
    }
    public static void main(String args[])
    {
        print(5);
    }

}
