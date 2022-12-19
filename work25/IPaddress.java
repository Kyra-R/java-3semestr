package work25;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IPaddress {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите ip-адрес:");
        Pattern address = Pattern.compile("^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
        String ipaddress = in.nextLine();
        if (address.matcher(ipaddress).matches()) {
            System.out.println("Верный адрес");
        } else {
            System.out.println("Неверный адрес");
        }
    }
}
