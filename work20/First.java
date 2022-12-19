package work20;

public class First<T, V, K> {
    private T t;
    private V v;
    private K k;

    public First(T t, V v, K k) {
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
        return "First:" + '\n'+ "T=" + t + ", V=" + v + ", K=" + k;
    }

    public static void main(String[] args) {
        First<Integer, String, Double> First = new First<>(2, "3", 3.0);
        System.out.println(First);
    }
}
