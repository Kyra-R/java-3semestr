package work14;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Console {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the text:");

        String text = in.nextLine();

        System.out.println("Enter the regex:");
        String reg = in.nextLine();
        Pattern pattern = Pattern.compile(reg);
        String[] splitted = pattern.split(text);
        System.out.println(Arrays.toString(splitted));
    }
}
