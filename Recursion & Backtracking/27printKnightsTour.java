// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] chess = new int[n][n];
        
        int row = sc.nextInt();
        int col = sc.nextInt();
        
        printKnightsTour(chess, row, col, 1);
    }
    
    public static void printKnightsTour(int[][] chess, int row,int col, int move){
        if(row<0 || col<0 || row >= chess.length || col >= chess.length || chess[row][col]>0){
            return;
        }else if(move == chess.length*chess.length){
            chess[row][col] = move;
            display(chess);
            chess[row][col] = 0;
            return;
        }
        
        chess[row][col] = move;
        
        printKnightsTour(chess, row-2, col+1, move+1);
        printKnightsTour(chess, row-1, col+2, move+1);
        printKnightsTour(chess, row+1, col+2, move+1);
        printKnightsTour(chess, row+2, col+1, move+1);  
        printKnightsTour(chess, row+2, col-1, move+1);
        printKnightsTour(chess, row+1, col-2, move+1);
        printKnightsTour(chess, row-1, col-2, move+1);
        printKnightsTour(chess, row-2, col-1, move+1);
        
        chess[row][col] = 0;

    }
    
    public static void display(int[][] chess){
        for(int[] rowArray : chess){
            for(int col_elem : rowArray){
                System.out.print(col_elem+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
