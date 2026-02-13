
public class StackLab1 {

	 // Simple array-based stack for ints
    static class IntStack {
        private int[] data;
        private int top; // index of top element

        public IntStack(int capacity) {
            data = new int[capacity];
            top = -1;
        }

        public void push(int x) {
            if (top == data.length - 1) {
                System.out.println("Stack overflow");
                return;
            }
            top++;
            data[top] = x;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack underflow");
                return -1; // or throw exception
            }
            int value = data[top];
            top--;
            return value;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return data[top];
        }
    }

    public static void main(String[] args) {
        IntStack stack = new IntStack(10);

        // Push: 10, 20, 30
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Pop twice
        System.out.println("Popped: " + stack.pop()); // 30
        System.out.println("Popped: " + stack.pop()); // 20

        // Print remaining
        System.out.println("Remaining element on stack: " + stack.peek()); // 10
    }
}

