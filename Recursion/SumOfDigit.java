public class SumOfDigit {
    
      static int sumDigit(int num) // Using Stackfalling
      {
          if(num==0)
          {
            return 0;
          }
          int sum=sumDigit(num/10);
          sum=sum+num%10;
          return sum;
          
      }
    
    
    static void sumDigit(int num,int sum) // USing Stackbuilding
    {
        if(num==0)
        {
            System.out.println("Sum is using void :"+sum);
            return;
        }
        int op=num%10;
        sumDigit(num/10,sum+op);
        
    }


    public static void main(String[] args) {
        sumDigit(12345,0);
        System.out.println("Sum is using int :"+sumDigit(12345));
    }

}
