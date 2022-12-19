package work14;
import java.util.regex.Pattern;

public class MatchNoMatch {
    public static void main(String[] args) {
        String match = "abcdefghijklmnopqrstuv18340";
        String nomatch = "abcdefghijklmnofdgfdgasdfasrstuv18340";
        System.out.println(match);
        System.out.println(Pattern.matches("abcdefghijklmnopqrstuv18340", match));
        System.out.println(nomatch);
        System.out.println(Pattern.matches("abcdefghijklmnopqrstuv18340", nomatch));
    }
}
