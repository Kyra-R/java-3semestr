package work23;

import java.util.Arrays;

interface Queue {
    //arr - очередь, n - текущее количество объектов, n* - количество объектов до действия,
    // e - элемент очереди, size - размер

    // Предусловие: e != null
    // Постусловие: n = n* + 1 И arr[n] = e
    void enqueue(Object element);

    // Предусловие: -
    // Постусловие: n = 0
    void clear();

    // Предусловие: size > 0
    // Постусловие: n = n* - 1 И arr*[0] = arr[0]
    Object dequeue();

    // Предусловие: size > 0
    // Постусловие: n = n* И arr*[0] = arr[0]
    Object element();

    // Предусловие: -
    // Постусловие: n = n* И arr*[0] = arr[0]
    boolean isEmpty();

    // Предусловие: -
    // Постусловие: n = n* И arr*[0] = arr[0]
    int size();

}

class ArrayQueueModule {
    static int size = 0;
    static Object[] elements = new Object[10];
    static int head = 0;
    static int tail = 0;

    static void enqueue(Object element) {
        assert element != null;
        ensureCapacity(size + 1);
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    static void ensureCapacity(int capacity) {
        if (capacity <= elements.length) {
            return;
        }
        elements = Arrays.copyOf(elements, 2 * capacity);
        head = 0;
        tail = size;
    }

    static Object dequeue() {
        assert size > 0;
        Object result = elements[head];
        head = (head + 1) % elements.length;
        size--;
        return result;
    }

    static Object element() {
        assert size > 0;
        return elements[head];
    }

    static int size() {
        return size;
    }

    static boolean isEmpty() {
        return size == 0;
    }

    static void clear() {
        size = 0;
        head = 0;
        tail = 0;
    }

}

class ArrayQueueADT {
    private int size = 0;
    private Object[] elements = new Object[10];
    private int head = 0;
    private int tail = 0;

    public static void enqueue(ArrayQueueADT queue, Object element) {
        assert element != null;
        ensureCapacity(queue, queue.size + 1);
        queue.elements[queue.tail] = element;
        queue.tail = (queue.tail + 1) % queue.elements.length;
        queue.size++;
    }

    public static void ensureCapacity(ArrayQueueADT queue, int capacity) {
        if (capacity <= queue.elements.length) {
            return;
        }
        queue.elements = Arrays.copyOf(queue.elements, 2 * capacity);
        queue.head = 0;
        queue.tail = queue.size;
    }

    public static Object dequeue(ArrayQueueADT queue) {
        assert queue.size > 0;
        Object result = queue.elements[queue.head];
        queue.head = (queue.head + 1) % queue.elements.length;
        queue.size--;
        return result;
    }

    public static Object element(ArrayQueueADT queue) {
        assert queue.size > 0;
        return queue.elements[queue.head];
    }

    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    public static void clear(ArrayQueueADT queue) {
        queue.size = 0;
        queue.head = 0;
        queue.tail = 0;
    }
}


abstract class AbstractQueue implements Queue {
    protected int size;

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }



    protected abstract Object doElement();
    protected abstract void doEnqueue(Object element);
    protected abstract Object doDequeue();
    protected abstract void doClear();

    public Object element() {
        assert size > 0;
        return doElement();
    }

    public void clear() {
        size = 0;
        doClear();
    }


    public void enqueue(Object element) {
        assert element != null;
        doEnqueue(element);
        size++;
    }


    public Object dequeue() {
        assert size > 0;
        Object result = doDequeue();
        size--;
        return result;
    }


}


class ArrayQueue extends AbstractQueue {
    // Инвариант: elements.length >= size И size >= 0 И 0 <= head < elements.length И 0 <= tail < elements.length
    private Object[] elements = new Object[10];
    private int head;
    private int tail;

    public void ensureCapacity(int capacity) {
        if (capacity <= elements.length) {
            return;
        }
        Object[] newElements = new Object[2 * capacity];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[(head + i) % elements.length];
        }
        elements = newElements;
        head = 0;
        tail = size;
    }

    protected void doEnqueue(Object element) {
        ensureCapacity(size + 1);
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
    }

    protected Object doElement() {
        return elements[head];
    }

    protected Object doDequeue() {
        Object result = elements[head];
        head = (head + 1) % elements.length;
        return result;
    }

    protected void doClear() {
        head = 0;
        tail = 0;
    }

}

class LinkedQueue extends AbstractQueue {
    // Инвариант: size == 0 И head == null И tail == null ИЛИ size > 0 И head != null И tail != null

    private static class Node {
        // Инвариант: value != null
        Object value;
        Node next;

        public Node(Object value, Node next) {
            assert value != null;
            this.value = value;
            this.next = next;
        }
    }
    
    private Node head, tail;

    protected Object doElement() {
        return head.value;
    }

    protected void doEnqueue(Object element) {
        Node newNode = new Node(element, null);
        if (size == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    protected Object doDequeue() {
        Object res = head.value;
        head = head.next;
        return res;
    }

    protected void doClear() {
        head = null;
        tail = null;
    }

}

public class ArrayQueueTesting {
    public static void main(String[] args) {
        System.out.println("=======Module========");
        ArrayQueueModule arr = new ArrayQueueModule();
        arr.enqueue(3);
        arr.clear();
        arr.enqueue(2);
        arr.enqueue(1);
        System.out.println(arr.element());
        System.out.println(arr.dequeue());
        System.out.println(arr.element());
        System.out.println("========ADT=======");
        ArrayQueueADT arr1 = new ArrayQueueADT();
        arr1.enqueue(arr1, 3);
        arr1.clear(arr1);
        arr1.enqueue(arr1, 2);
        arr1.enqueue(arr1, 1);
        System.out.println(arr1.element(arr1));
        System.out.println(arr1.dequeue(arr1));
        System.out.println(arr1.element(arr1));
        System.out.println("=========Arr======");
        ArrayQueue arr2 = new ArrayQueue();
        arr2.enqueue(3);
        arr2.clear();
        arr2.enqueue(2);
        arr2.enqueue(1);
        System.out.println(arr2.element());
        System.out.println(arr2.dequeue());
        System.out.println(arr2.element());
        System.out.println("========LinkedQueue=======");
        LinkedQueue arr3 = new LinkedQueue();
        arr3.enqueue(3);
        arr3.clear();
        arr3.enqueue(2);
        arr3.enqueue(1);
        System.out.println(arr3.element());
        System.out.println(arr3.dequeue());
        System.out.println(arr3.element());
    }
}
