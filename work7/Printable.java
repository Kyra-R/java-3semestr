package work7;



    public interface Printable {

        public void print();
    }
    class Book implements Printable {
        String text;
        public Book(String text){
            this.text = text;
        }
        public void print(){
            System.out.println(text);
        }

        public void printBooks(Printable[] printable){
            for(int i=0;i< printable.length;i++){
                if(printable[i] instanceof Book){
                    printable[i].print();
                }
            }
        }
    }

    class Magazine implements Printable {
        String text;
        public Magazine(String text){
            this.text = text;
        }
        public void print(){
            System.out.println(text);
        }

       public void printMagazines(Printable[] printable){
                for(int i=0;i< printable.length;i++){
                    if(printable[i] instanceof Magazine){
                        printable[i].print();
                    }
                }
        }
    }

