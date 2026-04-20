class QueueExample {
    static int front = -1, rear = -1;
    static int[] queue = new int[5];

    static void enqueue(int x) {
        if (rear == queue.length - 1) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1) front = 0;
            queue[++rear] = x;
            System.out.println(x + " inserted");
        }
    }

    static void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(queue[front++] + " removed");
        }
    }

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        dequeue();
    }
}
