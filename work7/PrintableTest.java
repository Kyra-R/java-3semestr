package work7;


public class PrintableTest {
    public static void main(String[] args){
        Magazine mag = new Magazine("");
        Book book = new Book("");
        Printable[] bookshop = new Printable[5];
        for(int i=0;i<3;i++){
            bookshop[i] = new Book("Book number "+i);
        }
        for(int i=3;i<5;i++){
            bookshop[i] = new Magazine("Magazine number "+i);
        }
        mag.printMagazines(bookshop);
        System.out.println("==================");
        book.printBooks(bookshop);
    }
}
