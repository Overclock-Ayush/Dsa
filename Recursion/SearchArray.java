public class SearchArray {
    public static void main(String args[])
    {   int arr[]={10,20,30,40,50};
        System.out.println(arr.length);
        int ans=isFound(arr,0,50);
        if(ans>0)
        {
            System.out.println("Found at :"+ans);
        }
        else{
            System.out.println("Element not found");
        }
    }
    static int isFound(int arr[],int index,int target)
    {
        if(index==arr.length)
        {
            return -1;
        }
        if(arr[index]==target)
        {
            return index;
        }
        return isFound(arr,index+1,target);
    }

}
