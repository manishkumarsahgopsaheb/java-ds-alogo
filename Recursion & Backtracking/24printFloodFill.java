// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int[][] arr = new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        boolean[][] visited = new boolean[m][n];
        
        printFloodFill(arr, 0, 0, visited, "");
        
    }
    
    public static void printFloodFill(int[][] maze, int row, int col, boolean[][] visited, String pathSofar){
        if(row<0 || col<0 || row == maze.length || col == maze[0].length || maze[row][col] == 1 || visited[row][col] == true){
            return;
        }
        
        if(row == maze.length-1 && col == maze[0].length-1){
            System.out.println(pathSofar);
            return;
        }
        visited[row][col] = true;
        
        printFloodFill(maze, row-1, col, visited, pathSofar + "t"); // for top
        printFloodFill(maze, row, col-1, visited, pathSofar + "l"); // for left
        printFloodFill(maze, row+1, col, visited, pathSofar + "d"); // for down
        printFloodFill(maze, row, col+1, visited, pathSofar + "r"); // for right
        
        visited[row][col] = false;
    }
}
// input 
// 6
// 7
// 0 1 0 0 0 0 0
// 0 1 0 1 1 1 0
// 0 0 0 0 0 0 0
// 1 0 1 1 0 1 1
// 1 0 1 1 0 1 1
// 1 0 0 0 0 0 0

// output
// ddrdddrrrrr
// ddrrttrrrrddlldddrr
// ddrrrrdddrr
