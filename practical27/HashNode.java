package practical27;

import java.util.LinkedList;

class HashNode<K, V> {
    K key;
    V value;

    public HashNode(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

class Hashtable<K, V> {
    private final LinkedList<HashNode<K, V>>[] hashTable;
    private final int capacity;
    private int size;

    public Hashtable(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.hashTable = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            hashTable[i] = new LinkedList<>();
        }
    }

    private int hashFunction(K key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode % capacity);
    }

    public void add(K key, V value) {
        int hashIndex = hashFunction(key);
        LinkedList<HashNode<K, V>> list = hashTable[hashIndex];
        for (HashNode<K, V> node : list) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }
        list.add(new HashNode<>(key, value));
        size++;
    }

    public V lookup(K key) {
        int hashIndex = hashFunction(key);
        LinkedList<HashNode<K, V>> list = hashTable[hashIndex];
        for (HashNode<K, V> node : list) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }

    public void delete(K key) {
        int hashIndex = hashFunction(key);
        LinkedList<HashNode<K, V>> list = hashTable[hashIndex];
        for (int i = 0; i < list.size(); i++) {
            HashNode<K, V> node = list.get(i);
            if (node.key.equals(key)) {
                list.remove(i);
                size--;
                return;
            }
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        for (LinkedList<HashNode<K, V>> list : hashTable) {
            for (HashNode<K, V> node : list) {
                System.out.println("Key: " + node.key + ", Value: " + node.value);
            }
        }
    }
}
class Main1 {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>(10);

        hashtable.add("apple", 5);
        hashtable.add("banana", 10);
        hashtable.add("orange", 8);

        System.out.println("Size: " + hashtable.size());
        System.out.println("Value of apple: " + hashtable.lookup("apple"));

        hashtable.delete("banana");

        System.out.println("Size: " + hashtable.size());

        hashtable.display();
    }
}

class Main2 {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>(10);

        hashtable.add("apple", 5);
        hashtable.add("banana", 10);
        hashtable.add("orange", 8);
        hashtable.add("grape", 3);
        hashtable.add("watermelon", 12);
        hashtable.add("kiwi", 6);
        hashtable.add("pineapple", 9);
        hashtable.add("pear", 4);
        hashtable.add("mango", 7);
        hashtable.add("strawberry", 2);

        System.out.println("Size: " + hashtable.size());
        System.out.println("Value of banana: " + hashtable.lookup("banana"));

        hashtable.delete("grape");

        System.out.println("Size: " + hashtable.size());

        hashtable.display();
    }
}
