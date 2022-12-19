package work2;

import java.util.Scanner;

public class StrArr {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String temp = in.nextLine();
        String[] list = new String[size];
        System.out.println("Original array:");
        for(int i=0;i<size;i++){
            list[i]= in.nextLine();
            System.out.println(list[i]);
        }
        System.out.println("============");
        for(int i=0;i<size/2;i++){
            temp = list [size-i-1];
            list[size-i-1]=list[i];
            list[i] = temp;
        }
        System.out.println("Sorted array:");
        for(int i=0;i<size;i++){
            System.out.println(list[i]);
        }
    }
}
