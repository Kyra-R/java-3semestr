package work2.Pack5;

public class Dog {
    private String name="";
    private int years=0;
    public Dog(String name, int years){
        this.name=name;
        this.years=years;
    }
    public String getName() { return name;}
    public int getYears() { return years;}
    public void setName(String name) { this.name=name;}
    public void setYears(int years) { this.years=years;}
    public int HumanAge(){
        return years*7;
    }
    public String toString(){
        return ("This dog is "+years+" years old, named "+name);
    }
}
