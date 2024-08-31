import tictactoe.TicTacToe;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("TIC TAC TOE Game Using CLI");
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.displayBoard();
        ticTacToe.placeMark(0,0,'x');
        ticTacToe.placeMark(2,1,'o');
        ticTacToe.displayBoard();
        }
    }
