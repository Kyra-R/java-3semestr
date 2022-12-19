package work2.Pack7;
import java.util.Scanner;
public class BookTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Book book=new Book();
        Bookshelf shelf = new Bookshelf(5);
        System.out.println("Enter 1 to test book, other to test bookshelf");
        int way = in.nextInt();

        if(way==1) {
            System.out.println("Enter a name for the book");
            String str = in.nextLine();
            book.setName(str);
            System.out.println("Enter an author for the book");
            str = in.nextLine();
            book.setAuthor(str);
            System.out.println("Enter a date for the book");
            int date = in.nextInt();
            book.setYear(date);
            System.out.println(book.toString());
        } else {
            for(int i=0;i< shelf.getAmount();i++){
                shelf.list[i].setName("Book"+i);
                shelf.list[i].setAuthor("Author"+i);
                shelf.list[i].setYear(2000-i);
            }

            shelf.showBooks();
            shelf.sortBookshelf();
            System.out.println("Sorted:");
            shelf.showBooks();
            System.out.println("Find earliest book made");
            System.out.println(shelf.getEarliest().toString()+" is the earliest book");
        }
    }
}
