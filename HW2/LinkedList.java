package HW2;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}
class Main {
    public static void printList(Node head) {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    public static Node push(Node head, int data) {
        Node node = new Node(data);
        node.next = head;
        return node;
    }
    public static Node reverse(Node head, Node headRef) {
        Node first, rest;
        if (head == null) {
            return headRef;
        }
        first = head;
        rest = first.next;
        if (rest == null) {
            headRef = first;
            return headRef;
        }
        headRef = reverse(rest, headRef);
        rest.next = first;
        first.next = null;
        return headRef;
    }

    public static Node reverse(Node head) {
        return reverse(head, head);
    }

    public static void main(String[] args) {
        int[] keys = { 1, 2, 3, 4, 5, 6 };
        Node head = null;
        for (int i = keys.length - 1; i >=0; i--) {
            head = push(head, keys[i]);
        }
        head = reverse(head);
        printList(head);
    }
}