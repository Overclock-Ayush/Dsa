public class PivotIndex {
    public static void main(String args[])
    {
        int []arr={1,7,3,6,5,6};
        int res=Operation(arr);
        System.out.println("Pivot Index is :"+res);
    }
    public static int Operation(int []arr)
    {   int sum=0;
        for(int i:arr)
        {
           sum=sum+i;
        }
        int leftSum=0;
        for(int j=0;j<arr.length;j++)
        {
            int rightSum=sum-leftSum-arr[j];
            if(leftSum==rightSum)
            {
                return j;
            }
            leftSum=leftSum+arr[j];

        }
        return -1;
    }

}
