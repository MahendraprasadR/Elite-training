import java.util.LinkedList;
public class LinkedListUsingBuiltin {
public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList();
    list.push(10);
     list.push(20);
     list.push(30);
     list.push(40);
     list.push(50);
     System.out.println(list);

     list.pop();
     System.out.println(list);

     System.out.println(list.peek());
     System.out.println(list.size());
     System.out.println(list.isEmpty());
}
}
