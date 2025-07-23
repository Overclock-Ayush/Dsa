import java.util.ArrayList;
import java.util.List;
public class SumOfKSubSequence {
    public static void main(String args[])
    {
        List<List<Integer>> BigList=new ArrayList<>();
        List<Integer>smallList=new ArrayList<>();
        int []arr={1,2,1};
        int k=2;
        Operation(arr,0,smallList,BigList,k,0);
        
    }
    public static void Operation(int[] arr,int index,List<Integer> smallList,List<List<Integer>> BigList,int k, int sum)
    {
        if(index==arr.length)
        {   if(sum==k)
            {
                System.out.println(smallList);

            }
            return;
        }
        smallList.add(arr[index]);
        sum=sum+arr[index];
        Operation(arr,index+1,smallList,BigList,k,sum);
        smallList.remove(smallList.size()-1);
        sum=sum-arr[index];
        Operation(arr,index+1,smallList,BigList,k,sum);
    }

}
