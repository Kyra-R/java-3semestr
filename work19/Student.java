package work19;

public class Student {
    private String name;
    private double result;

    public Student(String name, double result){
        this.name = name;
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public double getResult() {
        return result;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String toString() {
        return name + ": " + result;
    }
}
