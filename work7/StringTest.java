package work7;

public class StringTest {


        public static void main(String[] args) {
            ProcessStrings f = new ProcessStrings("abcdae");
            System.out.println("Amount of a:" + f.countSymbols('a'));
            System.out.println(f.newString());
            f.invertString();
            System.out.println(f.curs);
        }

}
