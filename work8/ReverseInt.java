package work8;

public class ReverseInt {
    public static int rec(int n, int i) { //i keeps,n adds

        return (n==0) ? i : rec( n/10, i*10 + n%10 );
    }
    public static void main(String[] args) {
        System.out.println(2314);System.out.println(rec(2314, 0));
    }
}
