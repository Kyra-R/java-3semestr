package work6;

public interface Convertable {
    public double fromCelsius();
}

class degreesFarenheit implements Convertable {
    double degrees;
    public degreesFarenheit(double degrees){
        this.degrees = degrees;
    }
    public double fromCelsius(){
        return degrees*1.8 + 32;
    };
}

class degreesKelvin implements Convertable {
    double degrees;
    public degreesKelvin(double degrees){
        this.degrees = degrees;
    }
    public double fromCelsius(){
        return degrees+273.15;
    };
}