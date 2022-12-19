package work13;

public class Person {
    StringBuilder name= new StringBuilder("");
    StringBuilder surname= new StringBuilder("");

    StringBuilder fathername= new StringBuilder("");

    public Person(String name, String surname, String fathername){
        this.name.append(name);
        this.surname.append(surname);
        this.fathername.append(fathername);
    }
    boolean checkNames(){
        boolean check = true;
        if(this.name.length()==0){
            System.out.println("No name?");
                check = false;
        }
        if(this.fathername.length()==0){
            System.out.println("No fathername?");
            check = false;
        }
        return check;
    }
    public String FIO(){
        if(checkNames())
        return name+" "+surname+" "+fathername;
        return "Wrong parameters";
    }
    public static void main(String[] args) {
        Person person = new Person("","Podshivalova","");
        System.out.println(person.FIO());
    }
}
