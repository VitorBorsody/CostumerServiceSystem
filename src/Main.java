
public class Main {
    public static void main(String[] args) {
        Client client = new Client("Vitor", 134);
        Client client2 = new Client("Fernanda", 135);
        Client client3 = new Client("Carlos", 234);
        ServiceQueue queue = new ServiceQueue();
        queue.Enqueue(client);
        queue.Enqueue(client2);
        queue.Enqueue(client3);
        queue.Display();
        queue.Dequeue();
        queue.Dequeue();
        queue.Display();
        queue.Dequeue();
        queue.Display();
        queue.Enqueue(client);
        queue.BeingServed();
        queue.EmptyQueue();
        queue.Dequeue();
        queue.EmptyQueue();

    }
}