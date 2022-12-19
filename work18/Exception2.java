package work18;
import java.util.Scanner;

public class Exception2 {
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
            System.out.println("Could not convert to int");
        }
    }

    public static void main(String[] args) {
        Exception2 e = new Exception2();
        e.exceptionDemo();
    }
}