package work2.Pack6;


public class Circle {
    double CenterX=0.0;
    double CenterY=0.0;
    double Rad=0.0;
    public void setCenter(double x, double y){
        CenterX=x;
        CenterY=y;
    }
    public void setRad(double Rad) { this.Rad=Rad;}
    public double getRad() { return Rad;}
    public double getX() { return CenterX;}
    public double getY() { return CenterY;}
    public Circle(double Rad, double x, double y){
        this.Rad=Rad; CenterX=x;CenterY=y;
    }
    public double findP(){
        return 6.28*Rad;
    }
    public double findS(){
        return 3.14*Rad*Rad;
    }
    public boolean ifEqual(Circle cir2){
        if(this.Rad==cir2.getRad()){
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String toString(){
        return ("Center on ("+CenterX+","+CenterY+"), radius "+Rad+" P="+findP()+" S="+findS());
    }

}
