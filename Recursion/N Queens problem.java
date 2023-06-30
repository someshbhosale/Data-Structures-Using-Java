class Solution {
    void saveboard(char[][] board,List<List<String>> allboards)
    {
        StringBuilder row=new StringBuilder();
        List<String> newboard=new ArrayList<>();
        for(int i=0; i<board.length; i++)
        {
            row.delete(0,row.length());
            for(int j=0; j<board[0].length; j++)
            {
                if(board[i][j]=='Q')
                {
                    row.append('Q');
                }                    
                else
                    row.append('.');    
            }
            newboard.add(row.toString());
        }
        allboards.add(newboard);
    }
    Boolean issafe(int row,int col,char[][] board)
    {
        int duprow=row;
        int dupcol=col;

        //upper diagonal
        while(row>=0 && col>=0)
        {
            if(board[row][col]=='Q')
                return false;
            row--;
            col--;    
        }
        row=duprow;
        col=dupcol;

        //left 
        while(col>=0)
        {
            if(board[row][col]=='Q')
                return false;
             col--;   
        }
        row=duprow;
        col=dupcol;
        //lower diagonal
        while(row<board.length && col>=0)
        {
            if(board[row][col]=='Q')
                return false;
            row++;
            col--;    
        }
        return true;
    }
    void helper(char[][] board,List<List<String>> allboards,int col)
    {
        if(col==board.length)
        {
            saveboard(board,allboards);
            return;
        }
        for(int row=0; row<board.length; row++)
        {
            if(issafe(row,col,board))
            {
                board[row][col]='Q';
                helper(board,allboards,col+1);
                board[row][col]='.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allboards=new ArrayList<>();
        char[][] board=new char[n][n];
        helper(board,allboards,0);
        return allboards; 
    }
}