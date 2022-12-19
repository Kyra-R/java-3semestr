package work2.Pack5;

public class PetHouse {
    Dog [] list = new Dog[50];
    int amount = 0;
    public int getAmount(){return amount;}
    public void addDog(Dog dog){
            if(amount<50){
                list[amount]=new Dog(dog.getName(),dog.getYears());
                amount+=1;
        }
    }
    public static void main(String args[]) {
        PetHouse pets= new PetHouse();
        Dog dog = new Dog ("Rex", 7);
        pets.addDog(dog);
        dog.setName("Lina");
        dog.setYears(5);
        pets.addDog(dog);
        for(int i=0;i<pets.getAmount();i++){
            System.out.println(pets.list[i].toString());
        }
    }
}
