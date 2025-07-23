public class MinMax {
    public static void main(String args[])
    {    int arr[]={10,786,99,100,78,5,100};
        int result[]=getMinMax(arr,0);
        System.out.println("Minimum is :"+result[0]+" Maximum is :"+result[1]);
        
    }
    static int[] getMinMax(int arr[],int index)
    {
        if(index==arr.length)
        {
            int result[]=new int[2];
            result[0]=Integer.MAX_VALUE;
            result[1]=Integer.MIN_VALUE;
            System.out.println(result[0]+" "+result[1]);
            return result;
        }
        int result[]=getMinMax(arr, index+1);
        if(result[0]>arr[index])
        {
            result[0]=arr[index];
        }
        else if (result[1]<arr[index])
        {
            result[1]=arr[index];

        }
        return result;

    }

}
