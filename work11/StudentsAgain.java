package work11;

import java.text.SimpleDateFormat;
import java.util.*;
import java.text.ParseException;


public class StudentsAgain {
    public static void main(String[] args) throws ParseException {
        Student2 st = new Student2();
        st.describeStudent();
        System.out.println(st.toString("short"));
        System.out.println(st.toString("middle"));
        System.out.println(st.toString("full"));
    }



}

class Student2 {
    Date birthdate=new Date();
    String name="";
    String surname="";
    String IDspec="";
    int year=0;
    String group="";

    double Result=0;

    String genString() {
        byte[] array = new byte[7]; // length is bounded by 7
        final Random random = new Random();
        for(int i=0;i<7;i++){
            array[i]=(byte) ((random.nextInt()%26+25)%26+97);
        }
        String generatedString = new String(array);

        return generatedString;
    }

    void setBirthday() throws ParseException {
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
    Scanner in = new Scanner(System.in);
        final Random random = new Random();
        int x = (random.nextInt()%30+29)%30;
        String date = x+"-";

        x = (random.nextInt()%3+2)%3;
        if(x==0){
            date+="Jul-";
        } else if (x==1){
            date+="Jun-";
        } else {
            date+="Aug-";
        }
        x = (random.nextInt()%10+9)%10+1995;
        date+=x+"";

    //String dateInString = in.nextLine();
    //String dateInString = "7-Jun-2013";
    birthdate = formatter.parse(date);
    }

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



    public Student2() throws ParseException {
        int rand;
        int rand2;
        final Random random = new Random();
        rand = (random.nextInt()%20+20)%20;
        rand2 = (random.nextInt()%4+3)%4+1;
        this.name=genString();
        this.surname=genString();
        this.IDspec=" Spec"+(rand2+1);
        this.group=" group-"+(rand+1);
        this.year=rand2;
        this.Result=((rand+rand2)/5.0);
        setBirthday();
    }
    public void describeStudent(){
        System.out.println( this.getName()+" "+ this.getSurname()+":"+ this.getIDspec()
                + this.getGroup()+" year:"+ this.getYear()+" Result:"+ this.getResult()+" birthday:"+birthdate);
    }

    public String toString(String mode){

        SimpleDateFormat dateFormatter;
        if(mode == "full"){
            dateFormatter = new SimpleDateFormat("dd MMMM yyyy");
                    return ("Full: " + dateFormatter.format(birthdate));
        } else
        if(mode == "short"){
            dateFormatter = new SimpleDateFormat("dd.MM.yyyy");
            return ("Short: " + dateFormatter.format(birthdate));
        } else {
            dateFormatter = new SimpleDateFormat("dd MMM yyyy");
            return ("Middle: " + dateFormatter.format(birthdate));
        }
    }


}