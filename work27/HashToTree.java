package work27;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashToTree {
    public static <T> Set<T> Transform(Set<T> hashSet)
    {
        Set<T> treeSet = new TreeSet<>();
        treeSet.addAll(hashSet);

        return treeSet;
    }

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Q");
        hashSet.add("A");
        hashSet.add("C");
        hashSet.add("B");

        System.out.println("hashSet:");
        System.out.println(hashSet);

        Set<String> treeSet = Transform(hashSet);
        System.out.println("treeSet:");
        System.out.println(treeSet);
    }
}
