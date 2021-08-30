// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        
        reverseDisplayArray(arr, 0);
    }
    
    public static void reverseDisplayArray(int[] arr, int index){
        if(index == arr.length)
            return;
        
        reverseDisplayArray(arr, index + 1);
        System.out.println(arr[index]);
    }
    
    
}
