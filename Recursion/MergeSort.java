import java.util.Arrays;

public class MergeSort {
    public static void main(String args[])
    {
       int nums[]={5,4,3,2,1};
        mergeSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));

        
    }
    public static void mergeSort(int[]nums,int low,int high)
    {
        if(low<high)
        {
            
        
        int mid=(low+high)/2;
        mergeSort(nums,low,mid);
        mergeSort(nums,mid+1,high);
        merge(nums,low,mid,high);
        }
    }

public static  void merge(int[]nums,int low,int mid,int high)
{
    int arr[]=new int[high+1];
    int k=0,i=low,j=mid+1;
    while(i<=mid&&j<=high)
    {
        if(nums[i]<nums[j])
        {
            arr[k]=nums[i];
            i++;
            k++;
        }
        else{
            arr[k]=nums[j];
            j++;
            k++;
        }
    }
    while(i<=mid)
    {
        arr[k]=nums[i];
            i++;
            k++;

    }
    while(j<=high)
    {
         arr[k]=nums[j];
            j++;
            k++;

    }
    for(int m=0;m<k;m++)
    {
        nums[low+m]=arr[m];
    }
}
}
    