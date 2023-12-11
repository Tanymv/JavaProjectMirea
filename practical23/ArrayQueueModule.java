package practical23;


public class ArrayQueueModule {
    private static Object[] elements = new Object[10];
    private static int size = 0;
    private static int head = 0;
    private static int tail = 0;

    public static void enqueue(Object x) {
        assert x != null : "Enqueued element should not be null";

        ensureCapacity(size + 1);
        elements[tail] = x;
        tail = (tail + 1) % elements.length;
        size++;
    }

    public static Object element() {
        assert size > 0 : "Queue should not be empty";

        return elements[head];
    }

    public static Object dequeue() {
        assert size > 0 : "Queue should not be empty";

        Object firstElement = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return firstElement;
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        for (int i = 0; i < size; i++) {
            elements[(head + i) % elements.length] = null;
        }
        head = 0;
        tail = 0;
        size = 0;
    }

    private static void ensureCapacity(int capacity) {
        if (capacity > elements.length) {
            int newCapacity = elements.length * 2;
            Object[] newElements = new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[(head + i) % elements.length];
            }
            elements = newElements;
            head = 0;
            tail = size;
        }
    }
}

abstract class ArrayQueueADT {
    protected Object[] elements = new Object[10];
    protected int size = 0;
    protected int head = 0;
    protected int tail = 0;

    public abstract void enqueue(Object q, Object x);

    public abstract Object element(Object q);

    public abstract Object dequeue(Object q);

    public abstract int size(Object q);

    public abstract boolean isEmpty(Object q);

    public abstract void clear(Object q);

    protected void ensureCapacity(Object q, int capacity) {
        if (capacity > elements.length) {
            int newCapacity = elements.length * 2;
            Object[] newElements = new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[(head + i) % elements.length];
                elements = newElements;
                head = 0;
                tail = size;
            }
        }
    }
}

class ArrayQueue extends ArrayQueueADT {
    public void enqueue(Object q, Object x) {

        assert q != null : "Queue should not be null";
        assert x != null : "Enqueued element should not be null";

        ensureCapacity(q, size + 1);
        elements[tail] = x;
        tail = (tail + 1) % elements.length;
        size++;
    }

    public Object element(Object q) {
        assert size > 0 : "Queue should not be empty";

        return elements[head];
    }

    public Object dequeue(Object q) {
        assert size > 0 : "Queue should not be empty";

        Object firstElement = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return firstElement;
    }

    public int size(Object q) {
        return size;
    }

    public boolean isEmpty(Object q) {
        return size == 0;
    }

    public void clear(Object q) {
        for (int i = 0; i < size; i++) {
            elements[(head + i) % elements.length] = null;
        }
        head = 0;
        tail = 0;
        size = 0;
    }
}

class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueueModule q1 = new ArrayQueueModule();
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        System.out.println(q1.dequeue()); // 1
        System.out.println(q1.element()); // 2
        System.out.println(q1.size()); // 2

        ArrayQueueADT q2 = new ArrayQueueADT() {
            @Override
            public void enqueue(Object q, Object x) {

            }

            @Override
            public Object element(Object q) {
                return null;
            }

            @Override
            public Object dequeue(Object q) {
                return null;
            }

            @Override
            public int size(Object q) {
                return 0;
            }

            @Override
            public boolean isEmpty(Object q) {
                return false;
            }

            @Override
            public void clear(Object q) {

            }
        };

    }
}
