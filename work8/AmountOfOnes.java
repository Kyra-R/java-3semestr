package work8;

import java.util.Scanner;

public class AmountOfOnes {
    public static int rec() {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int n = in.nextInt();
        if(n==0){
            int m = in.nextInt();
            if(m==0){
                return count;
            }
            else if(m==1){
                count+=1;
                return rec()+count;
            }
            else {
                return rec();
            }
        }  else if(n==1){
            count+=1;
            return rec()+count;
        }
        else {
            return rec();
        }

    }
    public static void main(String[] args) {
        System.out.println(rec());
    }
}