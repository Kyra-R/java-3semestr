package work2.Pack4;

public class Shop {
    Computer [] list= new Computer[50];
    int amount=0;
    public void addComp(Computer comp){
        if(amount<50){
            list[amount]=comp;
            amount+=1;
        }
    }
    public void deleteComp(Computer comp){
        for(int i=0;i<amount;i++){
            if(list[i].getName()==comp.getName()){
                for(int j=i;j<amount-1;j++){
                    list[i]=list[i+1];
                }
                amount-=1;
            }
        }
    }

    public String findComp(Computer comp){
        for(int i=0;i<amount;i++) {
            if(list[i].getName()==comp.getName()){
                return "Found " + comp.getName() + " at position "+i;
            }
        }
        return "Not found";
    }
}
