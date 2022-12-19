package work26;

import java.util.HashSet;
import java.util.Iterator;

public class Queue10 {
    public static void main(String[] args) {
        HashSet<String> map = new HashSet<>();
        for(int i=1;i<=10;i++) {
            map.add("element"+i);
        }

        Iterator<String> i = map.iterator();
        while (i.hasNext())
            System.out.println(i.next());
        System.out.println("==================");
        map.remove("element10");

        i = map.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }

}
