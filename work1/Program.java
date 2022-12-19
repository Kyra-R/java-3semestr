package work1;

import java.util.Scanner;
public class Program{
    public static void main(String args[]){
        System.out.println("How many numbers ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println("Which numbers ");
        int sum = 0;
        int[] arr = new int[x];
        for(int i=0;i<x;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Sum ");
        for(int i=0;i<x;i++){
            sum+=arr[i];
        }
        System.out.println("for:");
        System.out.println(sum);
        sum = 0;

        int i = 0;
        while(i<x){
            sum+=arr[i];
            i++;
        }
        System.out.println("while:");
        System.out.println(sum);
        sum = 0;
        i=0;
        if(x>0){
        do{
            sum+=arr[i];
            i++;
        }while(i<x);};
        System.out.println("do while:");
        System.out.print(sum);
        in.close();
    }
}
