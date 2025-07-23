package Array;
public class LongestSubArraySum {
    public static void main(String args[])
    {
        int []arr={3,1,2,7,4,2,1,1,5};
        int left=0,k=1;
        int sum=0;
        int max=0;
        for(int right=0;right<arr.length;right++)
        {sum=sum+arr[right];


            while(sum>k)
            {
                sum=sum-arr[left];
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        System.out.println(max);
    }

}
