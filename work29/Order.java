package work29;

import java.util.HashMap;

public interface Order {
    boolean add(Item item);
    String[] itemNames();
    int itemQuantity();
    int itemQuantity(String itemName);
    int itemQuantity(Item item);
    Item[] getItems();
    boolean remove(String itemName);
    boolean remove(Item item);
    int removeAll(String itemName);
    int removeAll(Item item);
    Item[] sortedItemsByCost();
    int costTotal();
}

class Node {
    private Item item;
    private Node next;
    private Node prev;

    public Node(Item item) {
        this.item = item;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Item getItem() {
        return item;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }
}

class InternetOrder implements Order {
    private Node head;
    private Node tail;
    private int size;

    public InternetOrder() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean add(Item item) {
        Node node = new Node(item);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
        }
        size++;
        return true;
    }

    public String[] itemNames() {
        String[] names = new String[size];
        Node node = head;
        for (int i = 0; i < size; i++) {
            names[i] = node.getItem().getName();
            node = node.getNext();
        }
        return names;
    }

    public int itemQuantity() {
        return size;
    }

    public int itemQuantity(String itemName) {
        Node node = head;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (node.getItem().getName().equals(itemName)) {
                count++;
            }
            node = node.getNext();
        }
        return count;
    }

    public int itemQuantity(Item item) {
        return itemQuantity(item.getName());
    }

    public Item[] getItems() {
        Item[] items = new Item[size];
        Node node = head;
        for (int i = 0; i < size; i++) {
            items[i] = node.getItem();
            node = node.getNext();
        }
        return items;
    }

    public boolean remove(String itemName) {
        Node node = head;
        for (int i = 0; i < size; i++) {
            if (node.getItem().getName().equals(itemName)) {
                if (node == head) {
                    head = head.getNext();
                    if (head != null) {
                        head.setPrev(null);
                    }
                } else if (node == tail) {
                    tail = tail.getPrev();
                    tail.setNext(null);
                } else {
                    node.getPrev().setNext(node.getNext());
                    node.getNext().setPrev(node.getPrev());
                }
                size--;
                return true;
            }
            node = node.getNext();
        }
        return false;
    }

    public boolean remove(Item item) {
        return remove(item.getName());
    }
    public int removeAll(String itemName) {
        int count = 0;
        while (remove(itemName)) {
            count++;
        }
        return count;
    }
    public int removeAll(Item item) {
        return removeAll(item.getName());
    }
    public Item[] sortedItemsByCost() {
        Item[] items = getItems();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (items[i].getPrice() < items[j].getPrice()) {
                    Item temp = items[i];
                    items[i] = items[j];
                    items[j] = temp;
                }
            }
        }
        return items;
    }
    public int costTotal() {
        int cost = 0;
        Node node = head;
        for (int i = 0; i < size; i++) {
            cost += node.getItem().getPrice();
            node = node.getNext();
        }
        return cost;
    }

}

class RestaurantOrder implements Order {
    private Node head;
    private Node tail;
    private int size;

    public RestaurantOrder() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean add(Item item) {
        Node node = new Node(item);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
        }
        size++;
        return true;
    }

    public String[] itemNames() {
        String[] names = new String[size];
        Node node = head;
        for (int i = 0; i < size; i++) {
            names[i] = node.getItem().getName();
            node = node.getNext();
        }
        return names;
    }

    public int itemQuantity() {
        return size;
    }

    public int itemQuantity(String itemName) {
        Node node = head;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (node.getItem().getName().equals(itemName)) {
                count++;
            }
            node = node.getNext();
        }
        return count;
    }

    public int itemQuantity(Item item) {
        return itemQuantity(item.getName());
    }

    public Item[] getItems() {
        Item[] items = new Item[size];
        Node node = head;
        for (int i = 0; i < size; i++) {
            items[i] = node.getItem();
            node = node.getNext();
        }
        return items;
    }

    public boolean remove(String itemName) {
        Node node = head;
        for (int i = 0; i < size; i++) {
            if (node.getItem().getName().equals(itemName)) {
                if (node == head) {
                    head = node.getNext();
                    head.setPrev(null);
                } else if (node == tail) {
                    tail = node.getPrev();
                    tail.setNext(null);
                } else {
                    node.getPrev().setNext(node.getNext());
                    node.getNext().setPrev(node.getPrev());
                }
                size--;
                return true;
            }
            node = node.getNext();
        }
        return false;
    }

    public int removeAll(String itemName) {
        int count = 0;
        while (remove(itemName)) {
            count++;
        }
        return count;
    }

    public int removeAll(Item item) {
        return removeAll(item.getName());
    }

    public boolean remove(Item item) {
        return remove(item.getName());
    }

    public Item[] sortedItemsByCost() {
        Item[] items = getItems();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (items[i].getPrice() < items[j].getPrice()) {
                    Item temp = items[i];
                    items[i] = items[j];
                    items[j] = temp;
                }
            }
        }
        return items;
    }

    public int costTotal() {
        int total = 0;
        Node node = head;
        for (int i = 0; i < size; i++) {
            total += node.getItem().getPrice();
            node = node.getNext();
        }
        return total;
    }


}

class OrderAlreadyAddedException extends Exception {
    public OrderAlreadyAddedException(String message) {
        super(message);
    }
}

class IllegalTableNumber extends Exception {
    public IllegalTableNumber(String message) {
        super(message);
    }
}


class OrderManager {
    HashMap<String, Order> orders = new HashMap<>();

    public Order getOrder(String address) {
        return orders.get(address);
    }
    public void remove(String address) {
        orders.remove(address);
    }
    public String getAddress(Order order) {
        for (String address : orders.keySet()) {
            if (orders.get(address) == order) {
                return address;
            }
        }
        return null;
    }
    public void addItem(String address, Item item) {
        orders.get(address).add(item);
    }
    public Order[] getOrders() {
        Order[] ordersArray = new Order[orders.size()];
        return orders.values().toArray(ordersArray);
    }
    public int ordersCostSummary() {
        int summary = 0;
        for (Order order : orders.values()) {
            summary += order.costTotal();
        }
        return summary;
    }
    public int sameDishQuantity(String dishName) {
        int quantity = 0;
        for (Order order : orders.values()) {
            quantity += order.itemQuantity(dishName);
        }
        return quantity;
    }

    public void add(String address, Order order) {
        try {
            if(orders.containsKey(address)) {
                throw new OrderAlreadyAddedException("Заказ уже заявлен");
            }
            if(address.contains("столик")&&!address.matches("^(столик )([1-9]|[1-2][0-9])$")){
                throw new IllegalTableNumber("Недопустимый столик");
            }
            orders.put(address, order);
        } catch (OrderAlreadyAddedException | IllegalTableNumber e) {
            System.out.println(e.getMessage());
        }
    }
}