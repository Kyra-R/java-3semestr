package work6;

public interface Printable {
    public void print();
}
class Book implements Printable{
    String text;
    public Book(String text){
        this.text = text;
    }
    public void print(){
        System.out.println(text);
    }
}

class Shop implements Printable{
    String text;
    public Shop(String text){
        this.text = text;
    }
    public void print(){
        System.out.println(text);
    }
}