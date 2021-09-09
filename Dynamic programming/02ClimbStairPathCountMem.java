public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] mem = new int[n+1];
        
        int count = CountStairPathMemoization(n, mem);
        System.out.println(count);
    }
    
    public static int CountStairPathMemoization(int n, int[] mem){
        if(n == 0){
            return 1; // path from 0 to 0 is 1
        }
        if(n<0){
            return 0;
        }
        if(mem[n]>0){
            return mem[n];
        }
        
        int p1 = CountStairPathMemoization(n-1, mem);
        int p2 = CountStairPathMemoization(n-2, mem);
        int p3 = CountStairPathMemoization(n-3, mem);
        
        int pcount = p1 + p2 + p3;
        mem[n] = pcount;
        return pcount;
    }
}
// input n = 5
// total path count = 13
