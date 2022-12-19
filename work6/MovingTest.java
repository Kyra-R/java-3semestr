package work6;

public class MovingTest {
    public static void main(String[] args){
        MovableCircle cir = new MovableCircle(0,0,5,10,6);
        System.out.println(cir.toString());
        cir.moveUp();
        cir.moveLeft();
        System.out.println(cir.toString());
        MovablePoint poi = new MovablePoint(100,100,10,10);
        System.out.println(poi.toString());
        poi.moveDown();
        poi.moveRight();
        System.out.println(poi.toString());
        MovableRectangle roi = new MovableRectangle(100,100,10,10,10,20);
        roi.moveDown();
        MovableRectangle roi2 = new MovableRectangle(100,100,20,10,10,10);
        roi2.moveLeft();
        System.out.println(roi2.toString());
    }
}
