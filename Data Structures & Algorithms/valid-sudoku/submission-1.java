class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
                char target = board[i][j];
                if (target == '.') continue;

                 for (int col = 0; col < 9; col++) {
                    if (col != j && board[i][col] == target) {
                        return false;
                    }
                }

                for (int row = 0; row < 9; row++) {
                    if (row != i && board[row][j] == target) {
                        return false;
                    }
                }
            
         if(checksquare(i, j, target, board))
         {
            return false;
         }
        }
        }
      return true;
    }
    public boolean checksquare(int row, int col, char target,char[][] board )
    {
     int startRow=  (row/3)*3;
     int startCol=  (col/3)*3;
     for(int i=startRow; i< startRow + 3; i++)
     {
         for(int j=startCol; j< startCol + 3; j++)
         {
               if (i == row && j == col) continue;
                if(board[i][j]==target)
                {
                    return true;
                }
         }
     }
        return false;
    }
}
