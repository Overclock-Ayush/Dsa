public class CountEvenOdd {
    static int[] countEvenOdd(int range) // Using Stack Falling
    {
        if(range==0)
        {
            int result[]=new int[2];
            return result;
        }
        int result[]=countEvenOdd(range-1);
        if(range%2==0)
        {
            result[0]++;
        }
        else{
            result[1]++;
        }
        return result;
    }
    
    
    
    static void countEvenOdd(int range,int even,int odd) // Using Stack Building
    {
        if(range==0)
        {
            System.out.println("Even count :"+even+ " Odd count :"+odd);
            return;
        }
         if(range%2==0)
         {
            even++;
         }
         else{
            odd++;
         }
         countEvenOdd(range-1,even,odd);
    }
    public static void main(String args[])
    {
        countEvenOdd(10,0,0);

        int res[]=countEvenOdd(11);
        System.out.println("Even count using array :"+res[0]);
        System.out.println("Odd count using array :"+res[1]);
    }

}
