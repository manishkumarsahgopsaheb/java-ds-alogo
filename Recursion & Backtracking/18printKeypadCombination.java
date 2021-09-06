  // "static void main" must be defined in a public class.
public class Main {
    // global
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        getKPC(str, "");

    }
    
    public static void getKPC(String ques, String ans){
        
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        
        char fch = ques.charAt(0);
        String roq = ques.substring(1);
        
        for(char ch : codes[fch - '0'].toCharArray()){
           getKPC(roq, ch + ans);
        }
    }
}

// input = 573
// output = [mtg, mth, mti, mug, muh, mui, ntg, nth, nti, nug, nuh, nui, otg, oth, oti, oug, ouh, oui]
