public class StackImplementation {
    int top;
    int size = 100;
    int[] stack = new int[size];

    // Constructor
    StackImplementation() {
        top = -1;
    }

    void push(int d) {
        if (top == size - 1) {
            System.out.println("Stack Overflow!");
        } else {
            top++;
            stack[top] = d;
        }
    }

    void display() {
        if (top == -1) {
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
        s.display();  // Displays the stack
    }
}