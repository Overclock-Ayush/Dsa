public class MazePath{
    public static void main(String args[])
    {
        Maze(0,0,2,2,"");
    }
    static void Maze(int row, int col, int endRow, int endCol, String result)
    {
        if(row==endRow && col==endCol)// Base Case
        {
            System.out.println(result);
            return ;

        }
        if(row>endRow || col>endCol)
        {
            return;
        }
        Maze(row+1,col,endCol,endRow,result+"V");// Vertical Path
        Maze(row, col+1,endCol, endRow,result+"H"); // Horizontal Path

    }
}