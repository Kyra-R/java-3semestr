package work8;

import java.util.Scanner;

public class Nechet {
    public static void rec() {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int n = in.nextInt();
       if(n>0) {
           if (n % 2 == 0) {
               rec();
           } else {
               System.out.println(n);
               rec();
           }
       }

    }
    public static void main(String[] args) {
        rec();
    }
}

