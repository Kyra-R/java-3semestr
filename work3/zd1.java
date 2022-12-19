package work3;

import java.util.Scanner;
public class zd1{
    public static void main(String args[]) {
        System.out.println("How many numbers ");
        Scanner in = new Scanner(System.in);
        int first = 0;
        int second = 1;
        int keeper;
        int amountofnum = in.nextInt();
        System.out.println("From number ");
        int firstnum = in.nextInt();
        if(firstnum>=3) {
            for (int i = 0; i < firstnum-2; i++) {
                keeper = second;
                second=first+second;
                first = keeper;
            }
        }
        if(firstnum==1) {
            System.out.printf("%d ", first);
            for (int i = 0; i < amountofnum - 1; i++) {
                System.out.printf("%d ", second);
                keeper = second;
                second = first + second;
                first = keeper;
            }
        } else {
            for (int i = 0; i < amountofnum; i++) {
                System.out.printf("%d ", second);
                keeper = second;
                second = first + second;
                first = keeper;
            }
        }
    }
}
