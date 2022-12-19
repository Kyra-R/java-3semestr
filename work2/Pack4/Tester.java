package work2.Pack4;

public class Tester {
    public static void main(String args[]) {
        Shop NewShop = new Shop();
        String s="";
        Computer comp1 = new Computer();
        Computer comp2 = new Computer();
        comp1.setName("ROG");
        comp2.setName("PHILIPS");
        NewShop.addComp(comp2);
        NewShop.addComp(comp1);
        s=NewShop.findComp(comp2);
        System.out.println(s);
    }
}
