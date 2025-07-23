public class ArraySorted {
    public static void main(String args[])
    {   int arr[]=new int[]{10,20,30,40,50,15};
        System.out.println("Array sorted is :"+isSorted(arr,0));
    }
    static boolean isSorted(int arr[],int index)
    {
        if(index==arr.length-1)
        {
            return true;
        }
        if(arr[index]>arr[index+1])
        {
            return false;

        }
        return isSorted(arr,index+1);
    }

}
