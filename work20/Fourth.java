package work20;

class Calculator {
    public static <N extends Number> double sum(N a, N b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <N extends Number> double sub(N a, N b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static <N extends Number> double div(N a, N b) {
        return a.doubleValue() / b.doubleValue();
    }

    public static <N extends Number> double mul(N a, N b) {
        return a.doubleValue() * b.doubleValue();
    }
}

class MinMax <N extends Comparable<N>> {
    private N[] array;

    public MinMax(N[] array) {
        this.array = array;
    }

    public N getMin() {
        N min = array[0];
        for (N n : array) {
            if (n.compareTo(min) < 0) {
                min = n;
            }
        }
        return min;
    }

    public N getMax() {
        N max = array[0];
        for (N n : array) {
            if (n.compareTo(max) > 0) {
                max = n;
            }
        }
        return max;
    }

}

public class Fourth {
    public static void main(String[] args) {
        Integer[] array = {5, 4, 0, 1, 2};
        Calculator calc = new Calculator();
        MinMax<Integer> minmax = new MinMax<>(array);
        System.out.println(minmax.getMax());
        System.out.println(minmax.getMin());

        System.out.println(calc.sum(5, 1));
        System.out.println(calc.mul(0, 2));
        System.out.println(calc.div(6, 2));
        System.out.println(calc.sub(1, 3));
    }
}
