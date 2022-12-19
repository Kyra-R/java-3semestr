package work25;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Skobki {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[()]");


        Scanner in = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String text = in.nextLine();
        Matcher matcher = pattern.matcher(text);

        int skobopen = 0;
        while (matcher.find()) {
            String c = matcher.group();

            if (skobopen < 0) {
                System.out.println("Неверно");
                return;
            }

            if (c.equals("(")) {
                skobopen++;
            } else {
                skobopen--;
            }

        }
        if (skobopen == 0) {
            System.out.println("Верно");
        } else {
            System.out.println("Неверно");
        }
    }
}
