

public class ReverseArray2 {
    public static void main(String args[])
    {
        int arr[]={10,20,30,40,50};
        Operation(0,arr,arr.length-1);
        System.out.println("Reversed array is :");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
    }
    public static void Operation(int i, int [] arr, int s)
    {
      if(i>=s/2)
      {
        return;
      }
     int  temp=0;
      temp=arr[i];
      arr[i]=arr[s-i];
      arr[s-i]=temp;
      Operation(i+1,arr,s);

    }

}
