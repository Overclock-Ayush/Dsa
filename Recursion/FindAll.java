public class FindAll {
    public static void main(String args[])
    {
        int arr[]={10,20,50,40,50,60,50};
        int index=0,search=50;
        int result[]=FindAt(arr,index,search);
        System.out.println("Element at :");
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
    static int[] FindAt(int arr[],int index,int search)
    {
        return Find(arr,index,search,0);
    }
    static int[] Find(int arr[],int index,int search,int count)
    {
        if(index==arr.length)
        {
            int result[]=new int[count];
            return result;
        }
        if(arr[index]==search)
        {
            count++;
        }
        int result[]=Find(arr,index+1,search,count);
        if(arr[index]==search)
        {
            result[count-1]=index;
        }
        return result;
    }

}
