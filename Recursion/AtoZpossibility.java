public class AtoZpossibility {
    public static void main(String args[])
    {
        printCombination(2,"");
    }
    static void printCombination(int strLength,String result)
    {
        if(result.length()==strLength)
        {
            System.out.print(result+", ");
            return;
        }
        for(char alpha='A';alpha<='Z';alpha++)
        {
            printCombination(strLength,result+alpha);
        }
    }

}
