package work2.Pack3;

public class Circle {
    Point center= new Point();
    double Rad=0.0;
    public void setCenter(double x, double y){
        center.setX(x);
        center.setY(y);
    }
    public void setRad(double Rad) { this.Rad=Rad;}
    public Circle(){
        setCenter(0.0,0.0);
    }
    public Circle(double Rad, double coord){
        setRad(Rad);setCenter(coord,coord);
    }
    @Override
    public String toString(){
        return ("Center on ("+center.getX()+","+center.getY()+"), radius "+Rad);
    }
}
