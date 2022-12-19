package work21;
import java.util.List;
public class AllTogether<N> { //all numbers
    private final N[] arr;
    public void printArray() { //print all
        for (N n : arr) {
            System.out.print(n+" ");
        }
        System.out.println();
    }

    public N get(int index) { //return index
        return arr[index];
    }

    public AllTogether(N[] array) {
        this.arr = array;
    }

    public final <T> void print(T... objs) { //print 5 objects
        List<Object> list = List.of(objs);
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] intArray = {5, 4, 3, 2, 1};
        Double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        Character[] charArray = {'P', 'R', 'A', 'C', 'T','I','C','E'};

        AllTogether<Integer> intObj = new AllTogether<>(intArray);
        AllTogether<Double> doubleObj = new AllTogether<>(doubleArray);
        AllTogether<Character> charObj = new AllTogether<>(charArray);

        intObj.printArray();
        doubleObj.printArray();
        charObj.printArray();

        System.out.println(intObj.get(2));
        System.out.println(doubleObj.get(2));
        System.out.println(charObj.get(2));

        intObj.print(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        intObj.print('P', 'R', 'A', 'C', 'T','I','C','E');
    }
}