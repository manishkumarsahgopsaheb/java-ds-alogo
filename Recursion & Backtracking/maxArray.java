// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        
        int max = maxOfArray(arr, 0);
        System.out.println(max);
    }
    
    public static int maxOfArray(int[] arr, int index){
        
        if(index == arr.length - 1){
            return arr[index];
        }
        
        int maxInRestArray = maxOfArray(arr, index + 1);
        
        if(maxInRestArray > arr[index]){
            return maxInRestArray;
        }
        else {
            return arr[index];
        }
    }
    
}
