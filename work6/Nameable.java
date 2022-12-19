package work6;

public interface Nameable {
    public String getName();
}

class AnimalName implements Nameable{
    String name;
    public AnimalName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

class PlanetName implements Nameable{
    String name;
    public PlanetName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

