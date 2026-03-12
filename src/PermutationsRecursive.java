import java.util.ArrayList;

public class PermutationsRecursive {

    public static void main(String[] args) {

        // QUESTION 1
        stringSwapWithoutTemp();

        // QUESTION 2
        String string = "this" ;

        ArrayList<String> list = new ArrayList<String>() ;
        permutations("", string, list) ;

        if (list.size() == fact(string.length())) {
            System.out.println(list) ;
            System.out.println(fact(string.length()));
            System.out.println("Permutations successful.") ;
        }
        else System.out.println("Permutations failed.");

    }

    public static void stringSwapWithoutTemp() {
        String x = "string1" ;
        String y = "string2" ;

        x = (x + y).substring(0,x.length()) ;
        y = (y + x).substring(0,y.length()) ;

        System.out.println(x);
        System.out.println(y);
    }

    public static void permutations(String result, String letters, ArrayList<String> list) {
        if (letters.length() == 0) {
            System.out.println(result);
            list.add(result);
            return;
        }

        for (int i = 0; i < letters.length(); i++) {
            char characterAtIndex = letters.charAt(i);
            String following = letters.substring(0, i) + letters.substring(i + 1);
            permutations(result + characterAtIndex, following, list);
        }
    }

    public static int fact(int n) {
        if (n == 1) return 1 ;
        return n * fact(n - 1) ;
    }
}
