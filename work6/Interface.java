package work6;

public interface Interface {
    public String giveCharact();
}

class Processor implements Interface{
    String Characteristics;
    public Processor(String text){
        Characteristics = text;
    }
    public String giveCharact(){
        return(Characteristics);
    }
}
class Memory implements Interface{
    String Characteristics;
    public Memory(String text){
        Characteristics = text;
    }
    public String giveCharact(){
        return(Characteristics);
    }
}

class Monitor implements Interface{
    String Characteristics;
    public Monitor(String text){
        Characteristics = text;
    }
    public String giveCharact(){
        return(Characteristics);
    }
}

class Computer{
    Processor CPU;
    Memory RAM;
    Monitor Screen;
}

enum Computers{
    ASUS, ACER, LENOVO, APPLE;
    Computer device;
   Computers(){
       device = new Computer();
        if(this.name()=="ASUS"){
            device.CPU = new Processor("Intel Core i7");
            device.RAM = new Memory("16Gb");
            device.Screen = new Monitor("23 inches");
        } else
        if(this.name()=="ACER"){
            device.CPU = new Processor("Intel Core i3");
            device.RAM = new Memory("4Gb");
            device.Screen = new Monitor("16 inches");
        } else
        if(this.name()=="LENOVO"){
            device.CPU = new Processor("Intel Core i5");
            device.RAM = new Memory("8Gb");
            device.Screen = new Monitor("32 inches");
        } else
        if(this.name()=="APPLE"){
            device.CPU = new Processor("Apple M1 Pro");
            device.RAM = new Memory("8Gb");
            device.Screen = new Monitor("27 inches");
        }

    }

    public void setDevice(String Proc, String Mem, String Mon){
        device.CPU.Characteristics = Proc;
        device.RAM.Characteristics = Mem;
        device.Screen.Characteristics = Mon;
    }

    public void checkDevice(){
        System.out.println(device.CPU.Characteristics +" "+
        device.RAM.Characteristics+ " " +
        device.Screen.Characteristics );
    }


}