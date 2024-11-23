public class circularLL {

    public class Node {

        int data;
        Node next;
        Node pre;

        Node(int data) {
            this.data = data;
            this.next = null;  
        }
    }

    private Node head;
    private Node tail;

    circularLL() {
        this.head = null;
        this.tail = null;

    }

    public void insertAtStart(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            tail.next = head;
        } else {
            newnode.next = head;
            head = newnode;
            tail.next = head;
        }
    }

    public void insertAtLast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            tail.next = head;
        } else {
            newnode.next = head;
            tail.next = newnode;
            newnode = tail;
        }
    }

    public void display() {
        System.out.print(head.data + "->");
        Node current = head.next;
        if (head == null) {
            return;
        }
        while (current != head) {
            System.out.print(current.data + "->");
            current = current.next;
        }
    }

    public void deleteatstart() {
        if (head == null) {
            System.out.println("Deleted");
            return;
        }
        head = head.next;
        tail = head;
    }

    public void deletelast() {
        if (tail == null) {
            System.out.println("Deleted");
            return;
        }
    }

    public static void main(String[] args) {
        circularLL cl=new circularLL();
        cl.insertAtLast(1);
        cl.insertAtLast(2);
        cl.insertAtLast(3);
        cl.insertAtLast(4);
        cl.insertAtLast(5);
        cl.display();

    }
}
