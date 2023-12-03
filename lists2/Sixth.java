package lists2;

class Node {
    String data;
    Node prev;
    Node next;

    public Node(String data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class Sixth {
    Node head;

    public Sixth() {
        this.head = null;
    }

    public void appendNode(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.prev = head;
            head.next = head;
        } else {
            Node current = head;
            Node previous = head.prev;

            while (current.next != head && compareStrings(data, current.data) > 0)
                current = current.next;

            newNode.prev = current.prev;
            newNode.next = current;
            current.prev = newNode;
            newNode.prev.next = newNode;

            if (compareStrings(data, head.data) < 0)
                head = newNode;

            compareStrings(data, previous.data);
        }
    }

    public void printList() {
        if (head == null)
            return;

        Node current = head;

        do {
            System.out.println(current.data);
            current = current.next;
        } while (current != head);
    }

    private int compareStrings(String str1, String str2) {
        if (str1.length() != str2.length())
            return str1.length() - str2.length();
        else
            return str1.compareTo(str2);
    }
}

class Main {
    public static void main(String[] args) {
        Sixth list = new Sixth();
        list.appendNode("apple");
        list.appendNode("banana");
        list.appendNode("orange");
        list.appendNode("kiwi");

        list.printList();
    }
}
