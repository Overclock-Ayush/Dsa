public class RollDice {
    public static void main(String[] args) {
        rollDice(0,10," ");
    }
    static void rollDice(int currentValue,int endValue, String result)
    {
        if(currentValue==endValue)
        {
            System.out.print(result+" ,");
            return;
        }
        if(currentValue>endValue)
        {
            return;
        }
        for(int dice=1;dice<=6;dice++)
        {
            rollDice(currentValue+dice,endValue,result+dice);
        }
    }

}
