class StackExample {
    static int top = -1;
    static int[] stack = new int[5];

    static void push(int x) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = x;
            System.out.println(x + " pushed");
        }
    }

    static void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top--] + " popped");
        }
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        pop();
    }
}
