import java.util.Scanner;

public class QueueProgram {

    static int[] queue = new int[10];
    static int front = 0;
    static int rear = -1;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("\n----- QUEUE MENU -----");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Size");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int value = input.nextInt();

                    if (rear == queue.length - 1) {
                        System.out.println("Queue is full!");
                    } else {
                        rear++;
                        queue[rear] = value;
                        System.out.println(value + " enqueued into queue.");
                    }
                    break;

                case 2:
                    if (front > rear) {
                        System.out.println("Queue is empty!");
                    } else {
                        int dequeuedValue = queue[front];
                        front++;
                        System.out.println(dequeuedValue + " dequeued from queue.");
                    }
                    break;

                case 3:
                    if (front > rear) {
                        System.out.println("Queue is empty!");
                    } else {
                        System.out.println("Queue elements:");

                        for (int i = front; i <= rear; i++) {
                            System.out.println(queue[i]);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Queue size: " + (rear - front + 1));
                    break;

                case 5:
                    if (front > rear) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Queue is not empty.");
                    }
                    break;

                case 6:
                    if (rear == queue.length - 1) {
                        System.out.println("Queue is full.");
                    } else {
                        System.out.println("Queue is not full.");
                    }
                    break;

                case 7:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }

    }
}
