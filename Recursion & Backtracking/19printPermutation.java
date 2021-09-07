// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        printPermutation(str, "");
    }
    
    public static void printPermutation(String ques, String ansSofar){
        if(ques.length()==0){
            System.out.println(ansSofar);
        }
        
        for(int i=0;i<ques.length();i++){
            char includeInanswer = ques.charAt(i) ;
            String leftpartStr = ques.substring(0, i);
            String rightpartStr = ques.substring(i+1);
            String roq = leftpartStr + rightpartStr;
            printPermutation(roq,  ansSofar + includeInanswer);
        }
    }
}
