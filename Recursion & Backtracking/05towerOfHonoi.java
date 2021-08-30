public class Main {
    
    public static void towerofHonoi(int n, int A, int B, int C){
        if(n==0)
            return;
        
        towerofHonoi(n-1, A, C, B);
        
        System.out.println(A + " - > "+ B + " = "+ n);
        
        towerofHonoi(n-1, C, B, A);
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();        
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        towerofHonoi(n, a, b, c);

    }
}
