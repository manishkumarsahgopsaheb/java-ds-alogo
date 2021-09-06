// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        List<String> sslist = getSubSequence(str);
        
        System.out.println(sslist);

    }
    //abc = [---, --c, -b-, -bc, a--, a-c, ab-, abc] // expectation
    //bc = [--, -c, b-, bc] // faith
    public static List<String> getSubSequence(String str){
        
        if(str.length()==0){
            List<String> l = new ArrayList<>();
            l.add("");
            return l;
        }
        
        char firstChar = str.charAt(0);
        String restSubstring = str.substring(1);
        List<String> restsubstrResult = getSubSequence(restSubstring);
        List<String> result = new ArrayList<>();
        for(String s : restsubstrResult){
            result.add("" + s);
        }
        
        for(String s:restsubstrResult){
            result.add(firstChar + s);
        }
        return result;
    }
}
// input = abc
// output = [, c, b, bc, a, ac, ab, abc]
