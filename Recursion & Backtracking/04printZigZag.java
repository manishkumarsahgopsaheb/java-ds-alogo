// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        printZigZag(n);
    }
    
    public static void printZigZag(int n){
        if(n==0)return;
        System.out.println("in pre "+n); // Pre Block
        printZigZag(n-1); // left call
        System.out.println("in In " + n); // In Block
        printZigZag(n-1); // right call
        System.out.println("in post "+ n); // Post Block
       
    }
}
