public class PrintAdjacent {
    public static void main(String[] args) {
        String res=Operation("AABB");
        System.out.println("Resultant string is :"+res);
    }
    static String Operation(String str)
    {
        if(str.length()<=1)
        {
            return str;
        }
        String res=Operation(str.substring(1));
        if(str.charAt(0)==str.charAt(1))
        {
            return str.charAt(0)+"*"+res;
        }
        else{
            return str.charAt(0)+res;
            }

    }

}
