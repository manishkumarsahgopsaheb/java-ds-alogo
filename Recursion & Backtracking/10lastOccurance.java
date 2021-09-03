// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        
        int num = sc.nextInt();
        int l_occur = lastOccurance(arr, num, 0);
        System.out.println(l_occur);
    }
    
    public static int lastOccurance(int[] arr, int num, int index){
        if(index == arr.length)
            return -1;
        
        int liira = lastOccurance(arr, num, index+1);
        
        if(liira == -1){
            if(arr[index]==num){
                return index;
            }else{
                return -1;
            }
        }
        else{
            return liira;
        }
        
    }
}
