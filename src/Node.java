public class Node {
    private Client client;
    Node next;

    public Node(Client client) {
        this.client = client;
        this.next = null;
    }

    public Client getClient() {
        return client;
    }
}
