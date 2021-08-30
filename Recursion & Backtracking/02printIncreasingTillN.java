// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        
        printIncreasing(n);
    }
    
    public static void printIncreasing(int n){
        if(n==0) return;
        
        printIncreasing(n-1);
        
        System.out.println(n);
    }
}

// input = 5
// output
// 1
// 2
// 3
// 4
// 5
