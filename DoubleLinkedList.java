public class DoubleLinkedList {
   class node{
    int data;
    node next;
    node prev;

    node(int value){
        data = value;
        next = null;
        prev = null;
    }
   }
    node head = null;
    public void insertBeginning(int value){
        node newNode = new node(value);
        if(head == null){
            head = newNode;
        }
        else{
           newNode.next = head;
           head.prev = newNode;
              head = newNode;
        }
        System.out.println(value + " inserted at beginning");
    }
    public void insertEnd(int value){
        node newNode = new node(value);
        if(head == null){
            head = newNode;
        }
        else{
            node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
        System.out.println(value + " inserted at end");
    }
    public void delete(int value){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.data == value){
            head = head.next;
            if(head != null){
                head.prev = null;
            }
            System.out.println(value + " deleted");
            return;
        }
        node temp = head;
        while(temp != null && temp.data != value){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println(value + " not found");
        }
        else{
            if(temp.next != null){
                temp.next.prev = temp.prev;
            }
            if(temp.prev != null){
                temp.prev.next = temp.next;
            }
            System.out.println(value + " deleted");
        }
    }
    
}
