package work6;

public class PriceTest {
    public static void main(String[] args) {
        LaptopPrice ROG = new LaptopPrice(1000);
        PhonePrice iPhone = new PhonePrice(500);
        System.out.println("LaptopPrice:" + ROG.getPrice());
        System.out.println("PhonePrice:" + iPhone.getPrice());
    }
}
