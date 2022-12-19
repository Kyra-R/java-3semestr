package work3;

import java.util.Scanner;
import java.util.Random;
public class zd3{
    public static void main(String args[]) {
        //System.out.println("How many numbers ");
        Scanner in = new Scanner(System.in);
        final Random random = new Random();

        double origNum = in.nextDouble();
        int Num=(int) Math.floor(origNum);
        int keeper = Num;
        String str1="";
        String str2="";
        char helper;
        int countSystem = in.nextInt();
        origNum = origNum - Math.floor(origNum);
        //origNum = Math.floor(origNum);
        double keeper2 = origNum;
        while(Num>=countSystem){
            if(Num%countSystem>=10) {
                str2 += (char) ((Num % countSystem)+55);
            } else {
                str2 +=  (Num % countSystem);
            }
            Num=Num/countSystem;
        }
        if(Num%countSystem>=10) {
            str2 += (char) ((Num % countSystem)+55);
        } else {
            str2 +=  (Num % countSystem);
        }
        //System.out.println(str2);

        for(int i=str2.length()-1;i>=0;i--){
            str1+=str2.charAt(i);
        }

       // System.out.println(str1);
        str2="";
        for(int i=0;i<3;i++){
            if((int) (Math.floor(origNum*countSystem))>=10) {
                str2 += (char)((int) (Math.floor(origNum * countSystem)-55));
            } else {
                str2 += ((int) (Math.floor(origNum * countSystem)));
            }
          //  str2+=" ";
            origNum = origNum*countSystem - Math.floor(origNum*countSystem);
        }
        System.out.println(str1+"."+str2);
    }
}
