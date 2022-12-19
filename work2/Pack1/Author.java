package work2.Pack1;

public class Author {
    public static void main(String args[]) {
        Author2 a = new Author2("Kto-to","123@mail",'X');
        System.out.println(a.getName());
        a.setEmail("Hmmm@mail");
        System.out.println(a.getEmail());
        System.out.println(a.getGender());
        System.out.println(a.toString());
    }
}
