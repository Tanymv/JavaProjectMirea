package lists1;

class First {
    String name, group;
    int age;

    public First(String name, String group, int age) {
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

class ListM<E> {
    private Node<E> head;
    private Node<E> tail;

    public static class Node<E> {
        E data;
        int index;
        Node<E> next;

        Node(E data) {
            this.data = data;
            this.index = 0;
            next = null;
        }
    }

    public void add(E data) {
        if (head == null) {
            head = new Node<>(data);
        } else {
            Node<E> temp = head;
            int index = 1;
            while (temp.next != null) {
                temp = temp.next;
                index += 1;
            }
            tail = temp.next = new Node<>(data); temp = temp.next;
            temp.index = index;
        }
    }

    public E get(int index) {
        Node<E> temp = head;
        if (index != 0) {
            for (int j = 0; j < index; j++) {
                temp = temp.next;
            }
        }
        return temp.data;
    }

    public void cut(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index < 0!");
        }
        if (head == null) {
            throw new IndexOutOfBoundsException("No have elements of Array");
        }

        Node<E> temp = head;
        if (index == tail.index) {
            for (int j = 0; j < index - 1; j++) {
                temp = temp.next;
            }
            temp.next = null;
        } else {
            for (int j = 0; j < index; j++) {
                temp = temp.next;
            }
            if (temp.next != null) {
                temp.data = temp.next.data;
                temp.index = temp.next.index - 1;
                temp.next = temp.next.next;
            }
        }
    }

    public void printList () {
        Node<E> temp = head;
        while (temp.next != null) {
            String str = String.format("[%d] ", temp.index);
            System.out.println(str + temp.data);
            temp = temp.next;
        }
        String str = String.format("[%d] ", temp.index);
        System.out.print(str + temp.data + "\n");
    }
}



class Main1 {
    public static void main(String[] args) {
        ListM<First> list = new ListM<>();

        list.add(new First("Оксана", "ИМО-01", 20));
        list.add(new First("Станислав", "ЛИБ-03", 18));
        list.add(new First("Антон", "ФАС-02", 16));

        list.printList();
        System.out.println(list.get(2).getName());
        list.cut(2);
        list.printList();

        System.out.println("Новые ребята:");
        list.add(new First("Милана", "МАС-09", 18));
        list.add(new First("Миша", "САР-01", 20));
        list.add(new First("Марина", "ПЗС-10", 19));
        list.printList();

        System.out.println("Возраст Оксаны: " + list.get(0).getAge());
    }
}

