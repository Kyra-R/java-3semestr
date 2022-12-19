package work8;

public class NechetNumbet {
    public static void rec() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();

        if (n > 0) {
            System.out.println(n);
            int m = in.nextInt();

            if (m > 0) {
                rec();
            }
        }
    }
    public static void main(String[] args) {
        rec();
    }
}
