package work7;

public class MathCalculableTest {
    public static void main(String[] args) {
    MathFunc f = new MathFunc();
        System.out.println("2^3:");
    System.out.println(f.pow(2,3));
        System.out.println("sqrt(3^2+4^2):");
    System.out.println(f.mod(3,4));
        System.out.println("P of a circle (r=1.5):");
    System.out.println(f.P(1.5));
    }
}
