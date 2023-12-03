package lists1;


class Second {
    String name, group;
    int age;

    public Second(String name, String group, int age) {
        this.name = name;
        this.group = group;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s; Группа: %s; Возвраст: %d", name, group, age);
    }
}

class Arrays<E>  {
    private Node<E> head, tail;

    public static class Node<E>{
        private final E data;
        private int index;
        private Node<E> prev, next;

        Node(E data) {
            this.data = data;
            this.index = 0;
            this.prev = null;
            this.next = null;
        }
    }

    public int getSize() {
        return tail.index + 1;
    }

    public void add(E data) {
        if (head == null) {
            head = new Node<>(data);
            tail = head;
        } else {
            Node<E> temp = tail;
            tail = new Node<>(data);
            temp.next = tail;
            tail.prev = temp;
            tail.index = tail.prev.index + 1;
        }
    }

    public E get(int index) {
        if (head == null || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Нет элементов или index < 0");
        }

        Node<E> thatNode;
        if (index < getSize() /2) {
            thatNode = head;
            for (int i = 0; i < index; i++) {
                thatNode = thatNode.next;
            }
        } else {
            thatNode = tail;
            for (int j = tail.index; j > index; j--) {
                thatNode = thatNode.prev;
            }
        }
        return thatNode.data;
    }

    public void cut(int index) {
        if (head == null || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Нет элементов или index < 0");
        }

        Node<E> thatNode;
        if (index == head.index) {
            thatNode = tail;
            while (thatNode.index != 1) {
                thatNode.index -= 1;
                thatNode = thatNode.prev;
            }
            head = thatNode;
            head.index -= 1;
            head.prev = null;
        } else if (index == tail.index) {
            tail = tail.prev;
            tail.next = null;
        } else {
            Node<E> pr, ne;
            if (index < getSize()/2) {
                thatNode = head;
                for (int i = 0; i < index; i++) {
                    thatNode = thatNode.next;
                }
            } else {
                thatNode = tail;
                for (int j = tail.index; j > index; j--) {
                    thatNode.index -= 1;
                    thatNode = thatNode.prev;
                }
            }
            pr = thatNode.prev; ne = thatNode.next;
            pr.next = ne;
            ne.prev = pr;
        }
    }

    public void printList () {
        Node<E> thatNode = head;
        while (thatNode != tail) {
            String str = String.format("[%d] ", thatNode.index);
            System.out.println(str + thatNode.data);
            thatNode = thatNode.next;
        }
        String str = String.format("[%d] ", thatNode.index);
        System.out.print(str + thatNode.data + "\n");
    }
}

class Main2 {
    public static void main(String[] args) {
        Arrays<Second> list = new Arrays<>();

        list.add(new Second("Оксана", "ИМО-01", 20));
        list.add(new Second("Станислав", "ЛИБ-03", 18));
        list.add(new Second("Антон", "ФАС-02", 16));

        list.printList();
        System.out.println("----------");
        list.cut(2);
        list.printList();

        list.add(new Second("Оксана", "ИМО-01", 20));
        list.add(new Second("Станислав", "ЛИБ-03", 18));
        list.add(new Second("Антон", "ФАС-02", 16));
        System.out.println("----------");
        list.printList();
        list.cut(0);
        System.out.println("----------");
        list.printList();
        list.cut(2);
        System.out.println("----------");
        list.printList();


        System.out.println("Новые ребята:");
        list.add(new Second("Милана", "МАС-09", 18));
        list.add(new Second("Миша", "САР-01", 20));
        list.add(new Second("Марина", "ПЗС-10", 19));
        list.printList();

        System.out.println("Возраст первого в списке: " + list.get(0).getAge());
    }
}
