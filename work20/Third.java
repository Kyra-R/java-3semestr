package work20;

import java.io.Serializable;

class Animal implements Serializable {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal:" + '\n' +
                "name: '" + name + '\'' +
                ", age: " + age;
    }
}

class Dog extends Animal {
    private String job;

    public Dog(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
        public String toString() {
            return "Dog:" + '\n' +
                    "name: '" + name + '\'' +
                    ", age: " + age + ", job: "+job;
        }
}
public class Third<T extends Comparable<T>, V extends Animal & Serializable, K>{
    private T t;
    private V v;
    private K k;

    public Third(T t, V v, K k) {
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
        return "Third:" + '\n' +
                "T=" + t + ", V=" + v + ", K=" + k;
    }

    public static void main(String[] args) {
        Third<Integer, Dog, String> Third = new Third<Integer, Dog, String> (1, new Dog("Rex", 5, "Guard"), "3");
        System.out.println(Third);
    }
}
