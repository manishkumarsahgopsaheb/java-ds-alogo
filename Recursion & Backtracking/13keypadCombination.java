// "static void main" must be defined in a public class.
public class Main {
    // global
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        List<String> words = getKPC(str);
        
        System.out.println(words);

    }
    
    public static List<String> getKPC(String str){
        
        if(str.length()==0){
            List<String> l = new ArrayList<>();
            l.add("");
            return l;
        }
        
        char fch = str.charAt(0);
        String sbstr = str.substring(1);
        List<String> faith = getKPC(sbstr); // 73
        List<String> expeclist = new ArrayList<>(); // 573
        
        // for integer value from character value, we can do following stuffs
        // fch - '0'
        // fch - 48
        // Integer.parseInt(fch + "")
        
        for(char ch : codes[fch - '0'].toCharArray()){
            for(String s : faith){
                expeclist.add(ch + s);
            }
        }
        
        return expeclist;
    }
}

// input = 573
// output = [mtg, mth, mti, mug, muh, mui, ntg, nth, nti, nug, nuh, nui, otg, oth, oti, oug, ouh, oui]
