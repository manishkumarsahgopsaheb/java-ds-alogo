// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        
        int num = sc.nextInt();
        int[] arrIndex = allIndices(arr, num, 0, 0);
        for(int index:arrIndex)
            System.out.println(index);
    }
    // will maintain the two variable, one will maintain the frequency count while going up and 
    // another will fill the array while coming down
    public static int[] allIndices(int[] arr, int num, int index, int freq){
        if(index == arr.length)
            return new int[freq];
        
        // while going up, incrementing the frequency count
        if(arr[index] == num){
            freq++;
        }
        int[] resArraysize = allIndices(arr, num, index+1, freq);
        
        // while coming down filling the array
        
        if(arr[index]==num){
            resArraysize[freq-1] = index;
        }
     
        return resArraysize;
    }
}
