public class StackImplementation {
    int top;
    int size = 100;
    int[] stack = new int[size];

    // Constructor
    StackImplementation() {
        top = -1;
    }

    // Check if stack is full
    boolean isFull() {
        return top == size - 1;
    }

    // Check if stack is empty
    boolean isEmpty() {
        return top == -1;
    }

    void push(int d) {
        if (isFull()) {
            System.out.println("Stack Overflow!");
        } else {
            top++;
            stack[top] = d;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StackImplementation s = new StackImplementation();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();  // Displays the stack
    }
}
