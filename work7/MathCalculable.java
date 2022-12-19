package work7;

import static java.lang.Math.sqrt;

public interface MathCalculable {
    double PI = 3.14;
    public double pow(double x, int y);
    public double mod(double x, double y);
}
class MathFunc implements MathCalculable {
    public double pow(double x, int y){
        double r =1;
        for(int i=0;i<y;i++){
            r=r*x;
        }
        return r;
    }
    public double mod(double x, double y){
        return sqrt(x*x+y*y);
    }
    public double P(double r){
        return 2*PI*r;
    }
}