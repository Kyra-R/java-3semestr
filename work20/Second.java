package work20;

public class Second<T, V, K> {
    private T t;
    private V v;
    private K k;

    public Second(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    @Override
    public String toString() {
        return "Second:" + '\n' +
                "T=" + t + " (" + t.getClass().getName() + ")" +
                ", V=" + v + " (" + v.getClass().getName() + ")" +
                ", K=" + k + " (" + k.getClass().getName() + ")";
    }

    public static void main(String[] args) {
        Second<Integer, String, Double> Second = new Second<>(2, "3", 3.0);
        System.out.println(Second);
    }
}
