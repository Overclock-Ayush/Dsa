public class PrintTable {
public static void main(String args[])
{
    Operation(5,10);
    System.out.println(Operation2(7,10));
}
static void Operation(int num,int table)
{
    if(table==0)
    {
        return;
    }
    Operation(num,table-1);
    System.out.println(num+"*"+table+"="+num*table);

}
static String Operation2(int num, int table)
{
    if(table==0)
    {
        return " ";
    }
    String res=Operation2(num, table-1);
    String expression=num+"*"+table+"="+(num*table)+"\n";
    return res+expression;
}
}
