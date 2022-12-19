package work26;
import java.util.ArrayList;

public class hashtab {
    public ArrayList<String> keys = new ArrayList<>();
    public ArrayList<String> vals = new ArrayList<>();

    public void put(String key, String value) {
        if (this.keys.contains(key)) {
            this.vals.set(this.keys.indexOf(key), value); //замена
        } else {
            this.keys.add(key);
            this.vals.add(value);
        }
    }

    public void sort() {
        for (int i = 0; i < this.keys.size(); i++) {
            for (int j = 0; j < this.keys.size() - 1; j++) {
                if (this.keys.get(j).compareTo(this.keys.get(j + 1)) > 0) {
                    String temp = this.keys.get(j);
                    this.keys.set(j, this.keys.get(j + 1));
                    this.keys.set(j + 1, temp);
                    temp = this.vals.get(j);
                    this.vals.set(j, this.vals.get(j + 1));
                    this.vals.set(j + 1, temp);
                }
            }
        }
    }

    public String get(String key) {
        return this.vals.get(this.keys.indexOf(key));
    }

    public void remove(String key) {
        this.vals.remove(this.keys.indexOf(key));
        this.keys.remove(key);
    }


    public void print() {
        for (int i = 0; i < this.keys.size(); i++) {
            System.out.println(this.keys.get(i) + ": " + this.vals.get(i));
        }
    }

    public static void main(String[] args) {
        hashtab map = new hashtab();
        map.put("Порода", "Овчарка");
        map.put("Возраст", "2 года");
        map.put("Имя", "Рекс");
        System.out.println(map.get("Порода"));
        System.out.println(map.get("Возраст"));
        System.out.println(map.get("Имя"));
        System.out.println("====================");
        map.print();
        System.out.println("====================");
        map.remove("Порода");
        map.print();

    }
}
