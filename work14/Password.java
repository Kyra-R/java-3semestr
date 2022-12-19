package work14;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Password {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String passw;
        passw =  "F032_Password";
        System.out.println(passw);
        System.out.println(Pattern.matches("\\w*[A-Z]+\\w*", passw) && Pattern.matches("\\w*\\d+\\w*", passw)
                && Pattern.matches("\\w*[a-z]+\\w*", passw));
        passw =  "TrySpy1";
        System.out.println(passw);
        System.out.println(Pattern.matches("\\w*[A-Z]+\\w*", passw) && Pattern.matches("\\w*\\d+\\w*", passw)
                && Pattern.matches("\\w*[a-z]+\\w*", passw));
        passw =  "smart_pass";
        System.out.println(passw);
        System.out.println(Pattern.matches("\\w*[A-Z]+\\w*", passw) && Pattern.matches("\\w*\\d+\\w*", passw)
                && Pattern.matches("\\w*[a-z]+\\w*", passw));
        passw =  "A007";
        System.out.println(passw);
        System.out.println(Pattern.matches("\\w*[A-Z]+\\w*", passw) && Pattern.matches("\\w*\\d+\\w*", passw)
                && Pattern.matches("\\w*[a-z]+\\w*", passw));

    }
}
