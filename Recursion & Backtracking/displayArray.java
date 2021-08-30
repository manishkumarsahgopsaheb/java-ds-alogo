// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        
        displayArray(arr, 0);
    }
    
    public static void displayArray(int[] arr, int index)
    {
        if(index == arr.length) return;
        
        System.out.println(arr[index]);
        displayArray(arr, index+1);
    }
    
}
