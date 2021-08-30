// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int pow = sc.nextInt();
        
        int val = power(n, pow);
        System.out.println(val);
    }
    
    public static int power(int n, int pow){
       if(pow==0)return 1;
        
        // return n*power(n, pow-1);  for linear solution
        
        if(pow%2==0){
            return power(n, pow/2)*power(n, pow/2);
        }
        else{
            return power(n, pow/2)*power(n, pow/2)*n;
        }
    }
}
