import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        char[][] board=new char[3][3];
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[row].length;col++){
                board[row][col]=' ';
            }
        }
        char player='x';
        boolean gameOver=false;
        Scanner sc=new Scanner(System.in);

        while(!gameOver){
            printBoard(board);
            System.out.println("Player "+player+", enter row and column:");
            int row=sc.nextInt();
            int col=sc.nextInt();

            if(board[row][col]==' '){
                board[row][col]=player;
                gameOver=haveWon(board,player);
                if(gameOver){
                    System.out.println("Player "+player+" wins!");
                }
                else{
                    if(player=='x'){
                        player='o';
                    }
                    else{
                        player='x';
                    }
                }
            }
            else{
                System.out.println("Invalid move, try again.");
                continue;
            }
        }
        printBoard(board);
    }

    public static boolean  haveWon(char[][]board, char player){
        //check rows
        for(int row=0;row<board.length;row++){
            if(board[row][0]==player && board[row][1]==player && board[row][2]==player){
                return true;
            }
        }

        //check columns
        for(int col=0;col<board[0].length;col++){
            if(board[0][col]==player && board[1][col]==player && board[2][col]==player){
                return true;
            }
        }   

        //check diagonals     for \
        if(board[0][0]==player && board[1][1]==player && board[2][2]==player){
            return true;
        }

        //check diagonals     for /
        if(board[0][2]==player && board[1][1]==player && board[2][0]==player){
            return true;
        }


        return false; 
    }

    public static void printBoard(char[][] board){
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[row].length;col++){
                System.out.print(board[row][col]+" |  ");
            }
            System.out.println();
        }
    }
}
