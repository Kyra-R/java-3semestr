package work10;

public class Student2 {

    String name="";
    String surname="";
    String IDspec="";
    int year=0;
    String group="";

    double Result=0;
    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getIDspec(){
        return IDspec;
    }

    public double getResult(){
        return Result;
    }

    public int getYear(){
        return year;
    }
    public String getGroup(){
        return group;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setSurname(String surname){
        this.surname=surname;
    }

    public void setIDspec(String IDspec){
        this.IDspec=IDspec;
    }

    public void setGroup(String group){
        this.group=group;
    }

    public void setYear(int year){
        this.year=year;
    }

    public void setResult(double Result){
         this.Result=Result;
    }

    public Student2(String name,String surname,String IDspec,String group, int year, double Result){
        this.name=name;
        this.surname=surname;
        this.IDspec=IDspec;
        this.group=group;
        this.year=year;
        this.Result=Result;
    }
    public Student2(){
    }

}
