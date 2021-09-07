// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        
        printEncoding(input, "");
    }
    
    public static void printEncoding(String ques, String ansSofar){
        
        if(ques.length()==0){
            System.out.println(ansSofar);
            return;
        }
        
        if(ques.length()==1){
            char ch = ques.charAt(0);
            if(ch=='0'){
                return;
            }else{
                int num = ch - '0';
                char code = (char)('a' + num - 1);
                System.out.println(ansSofar + code);
            }
        }else{
            char ch = ques.charAt(0);
            String roq = ques.substring(1);
            
            if(ch == '0'){
                return;
            }else{
                int num = ch-'0';
                char code = (char)('a'+num-1);
                 printEncoding(roq, ansSofar + code);
            }
            
            String ch12 = ques.substring(0, 2);
            String roq12 = ques.substring(2);
            
            int charval = Integer.parseInt(ch12);
            
            if(charval<=26){
                char code = (char)('a' + charval - 1);
                printEncoding(roq12, ansSofar + code);
            }
            
        }
    }
}

// input  = 123
// output = 
// abc
// aw
// lc
