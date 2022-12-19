package work6;

public interface Priceable {
    public int getPrice();
}

class LaptopPrice implements Priceable{
    int price;
    public LaptopPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
}

class PhonePrice implements Priceable{
    int price;
    public PhonePrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
}