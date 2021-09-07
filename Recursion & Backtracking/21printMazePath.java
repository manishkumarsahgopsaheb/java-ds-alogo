// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        printMazePath(1, 1, m, n, "");
    }
    
    public static void printMazePath(int sr, int sc, int dr, int dc, String ansSofar){
        
        if(sr == dr && sc == dc){
            System.out.println(ansSofar);
            return;
        }
        
        
        if(sr<dr){
            printMazePath(sr + 1, sc, dr, dc, ansSofar + "h");
        }
        if(sc<dc){
            printMazePath(sr, sc+1, dr, dc, ansSofar + "v");
        }
    }
}
