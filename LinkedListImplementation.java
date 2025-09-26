public class LinkedListImplementation {
class Node{
    int data;
    Node next;

    Node(int value){
        data = value;
        next = null;
    }
}
Node head=null;
void insert(int value){
    Node newNode = new Node(value);
    if(head == null){
        head = newNode;
    }
    else{
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    System.out.println(value + " inserted");
}
public void delete(int value) {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }
    if (head.data == value) {
        head = head.next;
        System.out.println(value + " deleted");
        return;
    }
    Node temp = head;
    while (temp.next != null && temp.next.data != value) {
        temp = temp.next;
    }
    if (temp.next == null) {
        System.out.println(value + " not found");
    } else {
        temp.next = temp.next.next;
        System.out.println(value + " deleted");
    }
}

public static void main(String[] args) {
    LinkedListImplementation list = new LinkedListImplementation();
    list.insert(10);
    list.insert(20);
    list.insert(30);
    list.delete(20);
    Node current = list.head;
    while (current != null) {
        System.out.print(current.data + " ");
        current = current.next;
    }
}
}

   