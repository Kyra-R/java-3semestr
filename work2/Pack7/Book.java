package work2.Pack7;

public class Book {
    private String name="Default";
    private String author="Default";
    private int year=0;
    public Book( String name, String author, int year){
        this.name=name;
        this.author=author;
        this.year=year;
    }
    public Book(){
    }
    public Book(Book copy){
        this.name=copy.name;
        this.author=copy.author;
        this.year=copy.year;
    }
    public String getName() { return name;}
    public String getAuthor() { return author;}
    public int getYear() { return year;}
    public void setName(String name) { this.name=name;}
    public void setAuthor(String author) { this.author=author;}
    public void setYear(int year) { this.year=year;}
    @Override
    public String toString(){
        return ("Name: "+getName()+", author is "+getAuthor()+", year is "+getYear());
    }


}

