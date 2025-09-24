package exercises;

/**
 * @author PhatNguyen
 * @created 18/09/2025 - 20:39
 * @project learn-java-w3school
 */
class Node<TData> {
    TData data;
    Node next;

    Node(TData data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList<TData> {
    Node<TData> head;
    Node<TData> tail;

    LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(TData data) {
        System.out.println("Adding...." + data);
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void remove(TData data) {
        System.out.println("Removing...." + data);
        Node current = head;
        Node previous = null;
        while (current != null) {
            if (current.data == data) {
                if (previous == null) {
                    head = current.next;
                } else {
                    previous.next = current.next;
                    if (current == tail) {
                        tail = previous;
                    }
                }
                return;
            }
            previous = current;
            current = current.next;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Empty list.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            current = current.next;
            if (current != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }
}

public class LinkedListEx {
    public static void main(String[] args) {
        operateIntegerList();
        operateStringList();
    }

    private static void operateIntegerList() {
        System.out.println("---Linked List with Integer---");
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.print();
        linkedList.add(1);
        linkedList.add(10);
        linkedList.add(9);
        linkedList.add(25);

        linkedList.print();

        linkedList.remove(9);
        linkedList.print();

        linkedList.remove(25);
        linkedList.print();

        linkedList.remove(1);
        linkedList.print();
        System.out.println("---**---");
    }

    private static void operateStringList() {
        System.out.println("---Linked List with String---");
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.print();
        linkedList.add("Hello");
        linkedList.add("world");
        linkedList.add("with");
        linkedList.add("Java");

        linkedList.print();

        linkedList.remove("with");
        linkedList.print();

        linkedList.remove("Java");
        linkedList.print();
        System.out.println("---**---");
    }
}
