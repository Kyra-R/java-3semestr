package work13;

import java.util.Scanner;

public class StringTest {
    public static void ReceiveString(String s){
        System.out.println(s.charAt(s.length()-1));
        if(s.endsWith("!!!")){
            System.out.println("Ends with !!!");
        } else {
            System.out.println("Doesn't end with !!!");
        }
        if(s.startsWith("I like")){
            System.out.println("Starts with I like");
        } else {
            System.out.println("Doesn't start with I like");
        }
        if(s.contains("Java")){
            System.out.println("Contains Java");
            System.out.println("Position of Java: "+s.indexOf("Java"));
        } else {
            System.out.println("There is no Java");
        }
        s=s.replace("Java","");
        System.out.println(s);
        s=s.replaceAll("a","o");
        System.out.println(s);
        s=s.toUpperCase();
        System.out.println(s);
        s=s.toLowerCase();
        System.out.println(s);

    }
    public static void main(String[] args) {
        Scanner conin = new Scanner(System.in);

        String s = conin.nextLine();
        ReceiveString(s);
    }
}
