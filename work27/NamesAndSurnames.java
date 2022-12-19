package work27;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class NamesAndSurnames {

    static public String randomizeName() {
        final Random random = new Random();
        int num = (random.nextInt() % 7 + 6) % 6;
        String name="";
        switch (num) {
            case (0):
                name = "Vladislav";
                break;
            case (1):
                name = "Sergey";
                break;
            case (2):
                name = "Innokentiy";
                break;
            case (3):
                name = "Nastya";
                break;
            case (4):
                name = "Anna";
                break;
            case (5):
                name = "Sofiya";
                break;
        }
        return name;
    }


    static public String randomizeSurname() {
        final Random random = new Random();
        int num = (random.nextInt() % 9 + 8) % 8;
        String name="";
        switch (num) {
            case (0):
                name = "Zemlyanko";
                break;
            case (1):
                name = "Deshko";
                break;
            case (2):
                name = "Lyalko";
                break;
            case (3):
                name = "Boyko";
                break;
            case (4):
                name = "Druzchenko";
                break;
            case (5):
                name = "Slesarenko";
                break;
            case (6):
                name = "Bratus";
                break;
            case (7):
                name = "Ingtem";
                break;
        }
        return name;
    }
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<>();
        for(int i=0;i<10;i++) {
            map.put(randomizeSurname(),  randomizeName());
        }

        return map;
    }
    public static int getSameFirstNameCount(HashMap<String, String> map, String name)
    {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(name)) {
                count++;
            }
        }
        return count;
    }
    public static int getSameLastNameCount(HashMap<String, String> map, String lastName)
    {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(lastName)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Map<String, String> map;
        map = createMap();
        String name = randomizeName();
        String surname = randomizeSurname();
        System.out.println("Search for:"+ name +", " + surname);
        System.out.println(map);
        System.out.println(getSameFirstNameCount((HashMap<String, String>) map, name));
        System.out.println(getSameLastNameCount((HashMap<String, String>) map, surname));
    }
}
