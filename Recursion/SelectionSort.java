import java.util.Arrays;
public class SelectionSort {
    public static void main(String args[])
    {
        int []arr={10,98,5,73,81,88,7};
        Operation(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void Operation(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        { int min=i;
           int temp=0;
           for(int j=i+1;j<arr.length;j++)
           { 
                if(arr[min]>arr[j])
                { temp=arr[min];
                    arr[min]=arr[j];
                    arr[j]=temp;

                }
           }

        }
    }

}
