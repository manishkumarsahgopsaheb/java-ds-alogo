// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        
        printDecreasing(n);
    }
    
    public static void printDecreasing(int n){
        if(n==0) return;
        
        System.out.println(n);
        
        printDecreasing(n-1);
    }
}

// input = 5
// output
// 5
// 4
// 3
// 2
// 1
