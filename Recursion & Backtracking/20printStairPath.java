// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        printStairPath(n, "");
    }
    
    public static void printStairPath(int n, String ansSofar){
        
        if(n==0){
            System.out.println(ansSofar);
            return;
        }
        if(n<0){
            return;
        }
        
        printStairPath(n-1, ansSofar + "1");
        printStairPath(n-2, ansSofar + "2");
        printStairPath(n-3, ansSofar + "3");
    }
}
