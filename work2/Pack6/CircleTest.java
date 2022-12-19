package work2.Pack6;

public class CircleTest {
    public static void main(String args[]) {
        Circle cir = new Circle(1.0,0.0,0.0);
        Circle cir2 = new Circle(1.0,2.0,0.0);
        if(cir.ifEqual(cir2)){
            System.out.println(cir.toString());
        } else {
            System.out.println(cir2.toString());
        }
    }
}
