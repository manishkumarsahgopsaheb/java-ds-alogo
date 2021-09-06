// input = 3, 3
// output = [hhvv, hvhv, hvvh, vhhv, vhvh, vvhh]
public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int dr = sc.nextInt(); // destination row
        int dc = sc.nextInt(); // destination column
        List<String> paths = getMazePaths(1, 1, dr, dc);
        System.out.println(paths);
    }
    
    public static List<String> getMazePaths(int sr, int sc, int dr, int dc){
        
        if(sr == dr && sc == dc){
            List<String> baselist = new ArrayList<>();
            baselist.add("");
            return baselist;
        }
        
        List<String> hpaths = new ArrayList<>();
        List<String> vpaths = new ArrayList<>();
        
        if(sc<dc){
            hpaths = getMazePaths(sr, sc+1, dr ,dc);
        }
        
        if(sr<dr){
            vpaths = getMazePaths(sr+1, sc, dr, dc);
        }
        
        List<String> paths = new ArrayList<>();
        
        for(String p : hpaths){
            paths.add("h"+p);
        }
        for(String p : vpaths){
            paths.add("v"+p);
        }
        return paths;
    }
}
