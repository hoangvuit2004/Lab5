public class TicTacToe {
    private static final char EMPTY = ' ';
    private char[][] board;

    public TicTacToe(char[][] board) {
        this.board = board;
    }

    public boolean checkRows() {
         int countX = 0;
        int countO= 0;
        int countEmptry = 0;
        for (int i = 0; i < board.length; i++) {

            if(countX == board.length){
                System.out.print("X win");
                return true;
            }
            if(countO == board.length){
                System.out.print("O win");
                return true;
            }
            countX = 0;
            countO= 0;
            countEmptry = 0;
            for (int j = 0; j < board.length; j++) {
                if(board[i][j] == 'X'){
                    countX++;
            }else if(board[i][j] == 'O'){
                    countO++;
                }else{
                    countEmptry++;
                }

            }
        }

        return false;
    }
    public boolean checkColumns() {
        int countX = 0;
        int countO= 0;
        int countEmptry = 0;
        for (int i = 0; i < board.length; i++) {

            if(countX == board.length){
                System.out.print("X win");
                return true;
            }
            if(countO == board.length){
                System.out.print("O win");
                return true;
            }
            countX = 0;
            countO= 0;
            countEmptry = 0;
            for (int j = 0; j < board.length; j++) {
                if(board[j][i] == 'X'){
                    countX++;
                }else if(board[j][i] == 'O'){
                    countO++;
                }else{
                    countEmptry++;
                }

            }
        }

        return false;
    }
    public boolean checkDiagonals() {
        int countX = 0;
        int countO= 0;
        int countEmptry = 0;
        int n = board.length-1;
        for (int i = 0; i < board.length; i++) {
            if(board[i][i] == 'X'){
                countX++;
            }else if(board[i][i] == 'O'){
                countO++;
            }else{
                countEmptry++;
            }

        }
        if(countX == board.length){
            System.out.print("X win");
            return true;
        }
        if(countO == board.length){
            System.out.print("O win");
            return true;
        }
        countX = 0;
        countO= 0;
        countEmptry = 0;
        for (int i = n; i >=0 ; i--) {
            if(board[i][n-i] =='X'){
                countX++;
            }else if(board[i][n-i] =='O'){
                countO++;
            }else{
                countEmptry++;
            }
        }
        if(countX == board.length){
            System.out.print("X win");
            return true;
        }
        if(countO == board.length){
            System.out.print("O win");
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
  char array[][] = {{'X','O','X'},{'X','X','O'},{'X','O','O'}};
  TicTacToe s1 = new TicTacToe(array);
  s1.checkRows();
  s1.checkColumns();
s1.checkDiagonals();
    }
}
