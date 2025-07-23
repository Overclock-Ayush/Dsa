import java.util.List;
import java.util.ArrayList;
public class SubSequence {
    public static void main(String args[])
    {   int []arr={3,1,2};
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> bigList=new ArrayList<>();
        printSubSequence(arr,0,list,bigList);
        System.out.println("Subsequence is :"+bigList);
    }
    public static void printSubSequence(int[]arr,int index,List<Integer> list,List<List<Integer>> bigList)
    {
        if(index==arr.length)
        {   
            bigList.add(new ArrayList(list));
            System.out.println("Current List"+list);
            return;
        }
        list.add(arr[index]);
        printSubSequence(arr,index+1,list,bigList);
        list.remove(list.size()-1);
        printSubSequence(arr,index+1,list,bigList);

    }

}
