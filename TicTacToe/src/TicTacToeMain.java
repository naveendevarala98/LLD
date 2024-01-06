import java.util.Scanner;

public class TicTacToeMain {
    public static void main(String[] args) {

        char[][] board = new char[3][3];
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[i].length;j++){
                board[i][j]=' ';
            }
        }
        int row =0;
        int col =0;
        Scanner scanner=new Scanner(System.in);
        move(board,row,col,scanner);
    }

    private static void move(char[][] board, int row, int col, Scanner scanner){
        boolean gameOver = false;
        char player ='X';
        while(!gameOver){
            printBoard(board);
            System.out.println("player "+player+" enter: ");
            row = scanner.nextInt();
            col= scanner.nextInt();
            if(board[row][col] == ' '){
                board[row][col]=player;
                gameOver=checkGameOver(board, player);
                if(gameOver){
                    System.out.println(player+" has won the game");
                }else{
                    player=(player == 'X') ? 'O' : 'X';
                }
            }else{
                System.out.println("enter valid move");
            }
        }
    }

    private static boolean checkGameOver(char[][] board, char player) {
        //check row
        for (int i=0;i<board.length;i++){
            if(board[i][0] == player && board[i][1] == player && board[i][2] == player){
                return true;
            }
        }

        //check col
        for (int i=0;i<board[0].length;i++){
            if(board[0][i] == player && board[1][0] == player && board[2][0] == player){
                return true;
            }
        }

        //diagonal - left to right
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }

        //DIAGONAL -  right to left
        if(board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;
        }
        return false;
    }

    private static void printBoard(char[][] board) {
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[i].length;j++){
                System.out.print(board[i][j]+" | ");
            }
            System.out.println();
        }
    }
}