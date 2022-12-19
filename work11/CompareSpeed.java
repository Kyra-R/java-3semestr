package work11;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.ParseException;

public class CompareSpeed {
    public static void main(String[] args) throws ParseException {
        ArrayList<String> list1 = new ArrayList<String>();
        List<String> list2 = new LinkedList<String>();

        long linkedTime;

        Scanner in = new Scanner(System.in);
        int x = -1;
        while (x != 0) {
            x = in.nextInt();
            if (x == 1) {
                x = in.nextInt();
                Date startLinked = new Date();
                //System.out.println(startLinked);
                if (x == 1) {
                    System.out.println("Add (ArrList):");
                    for (int i = 0; i < 5000000; i++) {
                        list1.add("1");
                    }
                } else if (x == 2) {
                    System.out.println("Add (LinkList):");
                    for (int i = 0; i < 5000000; i++) {
                        list2.add("1");
                    }
                } else if (x == 3) {
                    System.out.println("Insert (LinkList):");
                    for (int i = 0; i < 50000; i++) {
                        list2.add(0, "1");
                    }
                } else if (x == 4) {
                    System.out.println("Insert (ArrList):");
                    for (int i = 0; i < 50000; i++) { //dolgo...
                        list1.add(0, "1");
                    }
                }

                Date finishLinked = new Date();
               // System.out.println(finishLinked);
                linkedTime = finishLinked.getTime() - startLinked.getTime();
            } else {
                x = in.nextInt();
                if (x == 1) {

                    for (int i = 0; i < 100000; i++) {
                        list1.add("1");
                    }
                } else if (x == 2) {

                    for (int i = 0; i < 100000; i++) {
                        list2.add("1");
                    }
                }
                Date startLinked = new Date();
                if (x == 1) {
                    System.out.println("Delete (ArrList):");
                    for (int i = 0; i < 100000; i++) {
                        list1.remove("1");
                    }
                } else if (x == 2) {
                    System.out.println("Delete (LinkList):");
                    for (int i = 0; i < 100000; i++) {
                        list2.remove("1");
                    }
                }

                Date finishLinked = new Date();
                linkedTime = finishLinked.getTime() - startLinked.getTime();
            }
            System.out.println(linkedTime);
        }
    }
}
