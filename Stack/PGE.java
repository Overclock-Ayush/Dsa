import java.util.*;
public class PGE {
    public static void main(String args[])
    {
        int[]arr={10,5,100,90,88,99};
        ArrayList<Integer> list=new ArrayList<>();
         list=Operation(arr);
         System.out.println(list);
    }
    public static ArrayList<Integer> Operation(int[] arr)
    {   
       ArrayList<Integer>list=new ArrayList<>();
       Stack<Integer>stack=new Stack<>();
       
       for(int i=0;i<arr.length;i++)
       {
        while (!stack.isEmpty() && stack.peek()<=arr[i] )
        {
            stack.pop();
        }
        if(stack.isEmpty())
        {
            list.add(-1);
        }
        else{
            list.add(stack.peek());
        }
        stack.push(arr[i]);
       }
       return list;

    }

}
