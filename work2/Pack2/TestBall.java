package work2.Pack2;


public class TestBall {
    public static void main(String args[]) {
       Ball  a = new Ball();
       a.setXY(1.0,2.0);
       a.move(1.0,1.0);
        System.out.println("Premade ball:");
        System.out.println(a.toString());
    }
}
