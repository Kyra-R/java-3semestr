package work6;
import java.util.Scanner;
public class CovertingCelsius {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter degrees");
        double b = in.nextDouble();
        degreesFarenheit dF = new degreesFarenheit(b);
        degreesKelvin dK = new degreesKelvin(b);
        System.out.println("Enter 1 for converting in kelvin, 2 for farenheit");
        int x = in.nextInt();
        if(x==1){
            System.out.println("K:"+dK.fromCelsius());
        } else {
            System.out.println("F:"+dF.fromCelsius());
        }
    }
}
