public class CountSumOfKSubSequence {
    public static void main(String args[])
    {
        int [] arr={1,2,1};
        int k=2;
        int res=Operation(arr,0,0,k);
        System.out.println("Number of Subsequence whose sum is k are :"+res);
    }
    public static int Operation(int[]arr,int sum,int index,int k)
    {
        if(index==arr.length)
        {
            if(sum==k)
            {
                return 1;
            }
            else{
                return 0;
            }
        }
        sum=sum+arr[index];
        int l=Operation(arr,sum,index+1,k);
        sum=sum-arr[index];
        int r=Operation(arr,sum,index+1,k);
        return l+r;
    }

}
