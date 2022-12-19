package work2.Pack7;

public class Bookshelf
{
    Book [] list = new Book[50];
    int amount = 0;
    public Bookshelf(int amount){
        this.amount=amount;
        for(int i=0;i<amount;i++){
            list[i]=new Book();
        }
    }
    public int getAmount(){return amount;}
    public void addBook(Book book){
        if(amount<50){
            list[amount]=new Book(book.getName(),book.getAuthor(),book.getYear());
            amount+=1;
        }
    }

   public Book getEarliest(){
        int min=this.list[0].getYear();
        int index=0;
       for(int i=1;i<amount;i++){
           if(this.list[i].getYear()<min){
               min=this.list[i].getYear();
               index=i;
           }
       }
       return this.list[index];
   }
    public Book getLast(){
        int max=this.list[0].getYear();
        int index=0;
        for(int i=1;i<amount;i++){
            if(this.list[i].getYear()>max){
                max=this.list[i].getYear();
                index=i;
            }
        }
        return this.list[index];
    }

    public void sortBookshelf(){
        Book temp= new Book();
        for(int i=0;i<amount-1;i++){
            for(int j=i+1;j<amount;j++){
                if(this.list[i].getYear()>this.list[j].getYear()){
                    temp=this.list[i];
                    this.list[i]=this.list[j];
                    this.list[j]=temp;
                }
            }
        }
    }

    public void showBooks(){
        for(int i=0;i<this.getAmount();i++) {
            System.out.println(this.list[i].toString());
        }
    }
}
