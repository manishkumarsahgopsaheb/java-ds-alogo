// input = 3, 3
// output = [h1h1v1v1, h1h1v2, h1v1h1v1, h1v1v1h1, h1v1v1h1, h1v2h1, h1v1h1v1, h1v1v1h1, h1v1v1h1, h2v1v1, h2v2, v1h1h1v1, v1h1v1h1, v1h1v1h1, v1h2v1, v1v1h1h1, v1v1h2, v1v1h1h1, v1v1h2, v2h1h1, v2h2, v1h1h1v1, v1h1v1h1, v1h1v1h1, v1h2v1, v1v1h1h1, v1v1h2, v1v1h1h1, v1v1h2, v2h1h1, v2h2]
public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int dr = sc.nextInt(); // destination row
        int dc = sc.nextInt(); // destination column
        List<String> paths = getMazePathswithJump(1, 1, dr, dc);
        System.out.println(paths);
    }
    
    public static List<String> getMazePathswithJump(int sr, int sc, int dr, int dc){
    
        if(sc == dc && sr == dr){
            List<String> baseList = new ArrayList<>();
            baseList.add("");
            return baseList;
        }
        
        List<String> paths = new ArrayList<>();
        
        // horizontal moves
        for(int ms = 1; ms <= dc-sc; ms++){
            List<String> hpaths = getMazePathswithJump(sr, sc + ms, dr, dc);
            for(String hpath : hpaths){
                paths.add("h" + ms + hpath);
            }
        }
        
        // vertical moves
        for(int ms = 1; ms <= dr-sr; ms++){
            List<String> vpaths = getMazePathswithJump(sr + ms, sc , dr, dc);
            for(String vpath : vpaths){
                paths.add("v" + ms + vpath);
            }
        }
        
        // diagonal moves
        for(int ms = 1; ms <= dr-sr && ms <= dc-sc; ms++){
            List<String> dpaths = getMazePathswithJump(sr + ms, sc , dr, dc);
            for(String dpath : dpaths){
                paths.add("v" + ms + dpath);
            }
        }
        return paths;
    }
}
