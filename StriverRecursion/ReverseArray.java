
import java.util.List;
import java.util.ArrayList;
public class ReverseArray {
    public static void main(String args[])
    {
        int[]arr={10,20,30,40,50};
        List<Integer>al=new ArrayList<>();
        reverse(arr,al,0);
       System.out.println("Reverse array is :"+al);
       

    }
    public static void reverse(int []arr,List<Integer> list,int index)
    {
        if(index==arr.length)
        {
            return;
        }
        reverse(arr,list,index+1);
        list.add(arr[index]);
    }


}
