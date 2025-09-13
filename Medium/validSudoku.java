import java.util.HashSet;

public class validSudoku {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<Character> rowSet = new HashSet<>();
        HashSet<Character> colSet = new HashSet<>();
        HashSet<Character> gridSet = new HashSet<>();

        return rowCheck(board,rowSet,0,0) && colCheck(board,colSet,0,0);
    }

    public boolean gridCheck(char[][] board, HashSet<Character> gridSet, int row, int col){
        for(int i=row; i<row+3; i++){
            for(int j=col; j<col+3; j++){
                if(gridSet.contains(board[i][j])){
                    return false;
                }else{
                    if(board[i][j]!='.'){
                    gridSet.add(board[i][j]);
                    }
                }
            }
        }
        return true;
    }
    public boolean rowCheck(char[][] board, HashSet<Character> rowSet, int row, int col){
        
        if(row >= 9){
            return true;
        }

        if(col>=9){
            return rowCheck(board,new HashSet<Character>(),row+1,0);
        }

        if(rowSet.contains(board[row][col])){
            return false;
        }else{
            if(board[row][col]!='.'){
                rowSet.add(board[row][col]);
            }
        }
        return rowCheck(board,rowSet,row,col+1);
    }
 
    public boolean colCheck(char[][] board, HashSet<Character> colSet, int row, int col){
        
        if(col >= 9){
            return true;
        }

        if(row>=9){
            return colCheck(board,new HashSet<Character>(),0,col+1);
        }

        if(col%3 == 0 && row%3 == 0){
            if(!gridCheck(board,new HashSet<Character>(),row, col)){
                return false;
            }
        }

        if(colSet.contains(board[row][col])){
            return false;
        }else{
            if(board[row][col]!='.'){
                colSet.add(board[row][col]);
            }
        }

        return colCheck(board,colSet,row+1,col);
    }
}
