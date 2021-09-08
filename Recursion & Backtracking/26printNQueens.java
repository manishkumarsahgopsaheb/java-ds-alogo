// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[][] chessBoard = new int[n][n];
        
        printNQueens(chessBoard, 0, "");
    }
    
    public static void printNQueens(int[][] chess, int row, String ansSofar){
        if(row == chess.length){
            System.out.println(ansSofar+".");
            return;
        }
        
        for(int col=0;col<chess.length;col++){
            if(isQueenSafe(chess, row, col)==true){
                chess[row][col] = 1;
                printNQueens(chess, row + 1, ansSofar + row + "-" + col + ",");
                chess[row][col] = 0;
            } 
        }
    }
    
    public static boolean isQueenSafe(int[][] chess, int row, int col){
        // vertically
        for(int i = row-1, j = col; i>=0;i--){
            if(chess[i][j]==1){
                return false;
            }
        }
        
        // left diagonal
        
        for(int i = row-1, j = col-1; i>=0 && j>=0; i--,j--){
            if(chess[i][j]==1){
                return false;
            }
        }
        
        // right diagonal
        
        for(int i = row-1, j=col+1; i>=0 && j<chess.length; i--,j++){
            if(chess[i][j]==1){
                return false;
            }
        }
        
        return true;
    }
}

// input  = 4
// output
// 0-1,1-3,2-0,3-2,.
// 0-2,1-0,2-3,3-1,.
