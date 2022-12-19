package work29;

interface Item {
    String getName();
    String getDescription();
    int getPrice();
}

final class Drink implements Item {
    private final String name;
    private final String description;
    private final int price;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public Drink(String name, String description, int price) {
        try {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Должно присутствовать имя");
            }
            if (description == null || description.isEmpty()) {
                throw new IllegalArgumentException("Описание не может быть пустым");
            }
            if (price <= 0) {
                throw new IllegalArgumentException("Цена меньше или равна 0");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        this.name = name;
        this.description = description;
        this.price = price;
    }


}


final class Dish implements Item {
    private final String name;
    private final String description;
    private final int price;

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getPrice() {
        return price;
    }

    public Dish(String name, String description, int price) {
        try {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Должно присутствовать имя");
            }
            if (description == null || description.isEmpty()) {
                throw new IllegalArgumentException("Описание не может быть пустым");
            }
            if (price <= 0) {
                throw new IllegalArgumentException("Цена меньше или равна 0");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        this.name = name;
        this.description = description;
        this.price = price;
    }

}


public class Restaurant {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();

        Order order0 = new RestaurantOrder();
        order0.add(new Dish("Пельмени", "Много мяса, мало теста", 100));
        order0.add(new Drink("Квас", "о-о", 150));
        System.out.println("Цена заказа 0: "+order0.costTotal());
        orderManager.add("столик 0", order0);
        orderManager.add("столик 24", order0);


        Order order1 = new InternetOrder();
        order1.add(new Drink("Квас", "о-о", 150));
        Order order2 = new InternetOrder();
        order2.add(new Drink("Квас", "о-о", 150));
        Order order3 = new InternetOrder();
        order3.add(new Dish("Курицы жареная", "Острая", 225));

        orderManager.add("ул. Улица1", order1);
        orderManager.add("ул. Улица2", order2);
        orderManager.add("ул. Улица3", order3);
        System.out.println("Кваса заказано:");
        System.out.println(orderManager.sameDishQuantity("Квас"));

        order2.add(new Dish("питье", "питье", -1));
        orderManager.add("ул. Улица2", order2);

    }
}
