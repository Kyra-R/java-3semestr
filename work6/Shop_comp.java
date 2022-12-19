package work6;
import java.util.Scanner;

public class Shop_comp {
    Computers [] list= new Computers[5];
    int amount=0;
    public void listComputers(){
       for(int i=0;i<amount;i++){
           System.out.println(list[i].name());
           list[i].checkDevice();
       }
    }
    public void addComputer(Computers comp){
        if(amount<5){
            list[amount]=comp;
            amount+=1;
        }
    }
    public void deleteComputer(Computers comp){
        for(int i=0;i<amount;i++){
            if(list[i]==comp){
               // System.out.println("hehe"+i);
                for(int j=i;j<amount-1;j++){
                    //this.listComputers();
                    //System.out.println("============");
                    list[j]=list[j+1];

                }
                amount-=1;
                break;
            }
        }
    }

    public String findComputer(Computers comp){
        for(int i=0;i<amount;i++) {
            if(list[i]==comp){
                return "Found at position "+(i+1);
            }
        }
        return "Not found";
    }

    public Computers makeDevice(String par){
        Computers seek_device=Computers.ASUS;
        switch (par){
            case "ACER":
                seek_device = Computers.ACER;
                break;
            case "LENOVO":
                seek_device = Computers.LENOVO;
                break;
            case "APPLE":
                seek_device = Computers.APPLE;
                break;
        }
        return seek_device;
    }
    public static void main(String[] args){
        Computers seek_device;
        Shop_comp shop = new Shop_comp();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 for premade devices, 2 for yours");
        int x = in.nextInt();

        String par;
        if(x==1) {
            for (Computers comps : Computers.values()) {
                shop.addComputer(comps);
            }

            shop.listComputers();
        } else if (x==2){
            for(int i=0;i<8;i++){
                System.out.println("Name of the brand:");
                par = in.nextLine();
                seek_device=shop.makeDevice(par);
            }
        }
        while(x!=0) {
            System.out.println("Enter 1 for seeking device, 2 for deleting, 3 for listing, 4 for adding, 0 for exit");
            x = in.nextInt();
            if (x == 1) {
                par = in.nextLine();
                par = in.nextLine();
                seek_device = shop.makeDevice(par);
                //seek_device.checkDevice();
                System.out.println(shop.findComputer(seek_device));
            } else if (x == 2) {
                par = in.nextLine();
                par = in.nextLine();
                seek_device = shop.makeDevice(par);
                shop.deleteComputer(seek_device);
            } else
            if (x == 3) {
                shop.listComputers();
            } else
            if (x == 4) {
                par = in.nextLine();
                par = in.nextLine();
                seek_device = shop.makeDevice(par);
                shop.addComputer(seek_device);
            }
        }

       // shop.list = Computers.values();


    }
}

