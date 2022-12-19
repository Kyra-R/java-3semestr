package work2.Pack1;

public class Author2 {
    private String name;
    private String email;
    private char gender;
    public Author2( String name, String email, char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public String getName() { return name;}
    public String getEmail() { return email;}
    public char getGender() { return gender;}
    public void setEmail(String email){this.email = email;}
    @Override
    public String toString(){
        return ("Gender: "+gender+", name is "+getName()+", email is "+getEmail());
    }
}
