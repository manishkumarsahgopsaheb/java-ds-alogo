// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printSubString(str, "");
    }
    
    public static void printSubString(String question, String answer){
        if(question.length() == 0){
            System.out.println(answer);
            return;
        }
        char fch = question.charAt(0);
        String roq = question.substring(1);
        // for yes
        printSubString(roq, answer+fch);
        // for no
        printSubString(roq, answer+"");
    }
}
