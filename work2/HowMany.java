package work2;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s="test";
        boolean ifgap;
        int count = 0;
        while(s!=""){
            ifgap=false;
            s = in.nextLine();
            for(int i=0;i<s.length();i++){
                if((i==0) && (s.charAt(i)!=' ')){
                    count+=1;
                } else
                if(s.charAt(i)==' '){
                    ifgap=true;
                } else
                    if((ifgap==true) && (s.charAt(i)!=' ')){
                    ifgap=false;
                    count+=1;
                }
            }
        }
        System.out.println("Amount of words: "+count);
    }
}
