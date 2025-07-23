import java.util.Arrays;
public class InsertionSort {
      public static void main(String[] args) {
        int[] arr={10,98,5,73,81,7,88,7};
        Operation(arr);
        System.out.println(Arrays.toString(arr));

      }
      public static void Operation(int[] arr)
      {
        for(int i=1;i<arr.length;i++)
        { int j=i-1;
           int temp=arr[i];
           for(;j>=0;j--)
           {
            if(arr[j]>temp)
            {
                arr[j+1]=arr[j];
            }
            else{
                break;
            }
           }
           arr[j+1]=temp;

        }
      }

}
