// problem statement
// a man can jump to 1 step, 2 step or 3 step to reach ground
// we have to find all the possible paths
// input n = 4
// output = [1111, 112, 121, 13, 211, 22, 31]
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> result = getStairPaths(n);
        System.out.println(result);
    }
    
    public static List<String> getStairPaths(int n){
        if(n==0){
            List<String> list = new ArrayList<>();
            list.add("");
            return list;
        }else if(n<0){
            return new ArrayList<>();
        }
        // here we are having three faiths for one expectations
        List<String> paths1 = getStairPaths(n-1);
        List<String> paths2 = getStairPaths(n-2);
        List<String> paths3 = getStairPaths(n-3);

        // expectations
        List<String> paths = new ArrayList<>();
        
        for(String s : paths1){
            paths.add(1 + s);
        }
        for(String s : paths2){
            paths.add(2 + s);
        }
        for(String s : paths3){
            paths.add(3 + s);
        }
        return paths;
    }
}
