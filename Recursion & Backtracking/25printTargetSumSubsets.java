// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int target = sc.nextInt();
        
        printTargetSumSubsets(arr, 0, "", 0, target);
    }
    
    public static void printTargetSumSubsets(int[] arr, int index, String setSofar, int sumSofar, int target){
        if(index == arr.length){
            if(sumSofar == target){
                System.out.println(setSofar+".");
            }
            return;
        }
        // yes call
        printTargetSumSubsets(arr, index+1, setSofar + arr[index] + ",", sumSofar + arr[index], target);
        
        // no call
        
        printTargetSumSubsets(arr, index+1, setSofar, sumSofar, target);
    }
}

// input = 
// n = 5
// arr = [10, 20, 30, 40, 50]
// output = 
// 10,20,40,.
// 20,50,.
// 30,40,.
