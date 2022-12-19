package work6;

public class PrintableTest {
    public static void main(String[] args){
        Printable[] bookshop = new Printable[5];
        for(int i=0;i<3;i++){
            bookshop[i] = new Book("Book number "+i);
        }
        for(int i=3;i<5;i++){
            bookshop[i] = new Shop("Shop number "+i);
        }
        for(int i=0;i<5;i++){
            bookshop[i].print();
        }
    }
}
