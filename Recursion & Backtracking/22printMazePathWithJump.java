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
        
        // horizontal
        for(int ms = 1; ms<=dc-sc;ms++){
            printMazePath(sr, sc+ms, dr, dc, ansSofar+ "h" +ms);
        }
        
        // vertical
        for(int ms = 1; ms<=dr-sr;ms++){
            printMazePath(sr+ms, sc, dr, dc, ansSofar+ "v" +ms);
        }
        
        // diagonal
        for(int ms = 1; ms<=dr-sr && ms<=dc-sc;ms++){
            printMazePath(sr+ms, sc+ms, dr, dc, ansSofar+ "d" +ms);
        }
    }
}

// input  = 3 3
// output = h1h1v1v1
// h1h1v2
// h1v1h1v1
// h1v1v1h1
// h1v1d1
// h1v2h1
// h1d1v1
// h2v1v1
// h2v2
// v1h1h1v1
// v1h1v1h1
// v1h1d1
// v1h2v1
// v1v1h1h1
// v1v1h2
// v1d1h1
// v2h1h1
// v2h2
// d1h1v1
// d1v1h1
// d1d1
// d2
