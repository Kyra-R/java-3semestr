package work18;
import java.util.Scanner;

public class Exception4 {
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        } catch (NumberFormatException e) {
            System.out.println("String or float for input");
        } finally {
            System.out.println("Finally");
        }
    }

    public static void main(String[] args) {
        Exception4 e = new Exception4();
        e.exceptionDemo();
    }
}
