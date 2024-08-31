package tictactoe;

public class TicTacToe {
    char[][] board;

//    Creating constructor
    public TicTacToe(){
        board = new char[3][3];
        initBoard();
    }
    void initBoard(){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                board[i][j] = ' ';
            }
        }
    }

    public void displayBoard() {
        System.out.println("-------------");
        for (int i = 0; i < board.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

   public void placeMark(int row, int col, char mark){
        board[row][col] =  mark;
    }
}
