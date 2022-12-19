package work1;

import java.util.Scanner;
import java.util.Random;
public class Program3 {
    public static void main(String args[]) {
        System.out.println("How many numbers ");
        Scanner in = new Scanner(System.in);
        final Random random = new Random();

        int x = in.nextInt();
        int addnum;
        int casenum = 1;
        System.out.println("Math.random (1) or Random (2) ");
        while (casenum != 0) {
            casenum = in.nextInt();
            double num;
            int[] arr = new int[x];
            if (casenum == 1) {
                for (int i = 0; i < x; i++) {
                    num = Math.random() * 100;
                    arr[i] = (int) Math.round(num);
                    System.out.printf("%d ", arr[i]);
                }
            } else if (casenum == 2) {
                for (int i = 0; i < x; i++) {
                    arr[i] = random.nextInt() % 50 + 50;
                    System.out.printf("%d ", arr[i]);
                }
            }
            if(casenum!=0) {
                System.out.printf("\n Sorted: \n ");

                for (int i = 0; i < x - 1; i++) {
                    for (int j = i; j < x; j++) {
                        if (arr[i] < arr[j]) {
                            addnum = arr[i];
                            arr[i] = arr[j];
                            arr[j] = addnum;
                        }
                    }
                }
                for (int i = 0; i < x; i++) {
                    System.out.printf("%d ", arr[i]);
                }
            }
            System.out.println();
        }
    }
}