public class TowerOfHanoi {
    public static void main(String args[])
    {
        TOH(3,'A','B','C');
    }
    static void TOH(int disk,char source,char helper,char destination)
    {
        if(disk==0)
        {
            return;
        }
        TOH(disk-1,source,destination,helper);
        System.out.println("Disk :"+disk+" From :"+helper+" "+ "Transfered to :"+destination);
        TOH(disk-1,helper,source,destination);
    }

}
