package work3;

import java.util.Scanner;
import java.util.Random;
public class zd2{
    public static void main(String args[]) {
        System.out.println("How many numbers ");
        Scanner in = new Scanner(System.in);
        final Random random = new Random();

        int x = in.nextInt();
        int delnum;
        int count = 0;
        int[] arr = new int[x];
            for (int i = 0; i < x; i++) {
                arr[i] = random.nextInt()%50+50;
                System.out.printf(" %d", arr[i]);
            }
        System.out.println("\n Which to delete ");
        delnum = in.nextInt();
        for (int i = 0; i < x; i++) {
            if(arr[i]==delnum){
                count+=1;
            } else {
                arr[i - count] = arr[i];
            }
        }
        for (int i = 0; i < x-count; i++) {
            System.out.printf(" %d",arr[i]);
        }
        System.out.println("\n Ending in");
        delnum = in.nextInt();
        count = 0;
        for (int i = 0; i < x; i++) {
            if(arr[i]%10==delnum){
                count+=1;
            } else {
                arr[i - count] = arr[i];
            }
        }
        for (int i = 0; i < x-count; i++) {
            System.out.printf(" %d",arr[i]);
        }
    }
}