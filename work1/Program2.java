package work1;

public class Program2 {
    public static void main(String args[]) {
        double sum = 1;
        double num=1;
        System.out.printf("%.2f ",num);
        for(int i=2;i<=10;i++){
            num=Math.round(1.0/i*100.0)/100.0;
            System.out.printf("%.2f ",num);
            sum+=num;
        }
        System.out.printf(" Sum:%.2f",sum);
    }
}
