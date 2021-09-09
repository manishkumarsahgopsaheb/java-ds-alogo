public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mem = new int[n+1];
        int fibn = fibMemo(n, mem);
        System.out.println(fibn);
        // System.out.println(fib(n));
    }
    
    public static int fibMemo(int n, int[] mem){
        if(n==0 || n==1){
            return n;
        }
        
        if(mem[n]>0){
            return mem[n];
        }
        
        int fnm1 = fibMemo(n-1, mem);
        int fnm2 = fibMemo(n-2, mem);
        int fibn = fnm1 + fnm2;
        
        mem[n] = fibn;
        return fibn;
    }
    
    // without memoization, it will be costly
    public static int fib(int n){
        if(n==0 || n==1)
            return n;
        
        int fibn = fib(n-1) + fib(n-2);
        
        return fibn;
    }
}
