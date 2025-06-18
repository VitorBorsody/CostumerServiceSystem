public class ServiceQueue {
    private Node first;
    private Node last;

    public ServiceQueue() {
        this.first = null;
        this.last = null;
    }
    public void Enqueue(Client client){
        Node newNode = new Node(client);
        if(first==null){
            first = newNode;
        }
        else {
         last.next = newNode;

        }
        last = newNode;
        System.out.println(" ");
        System.out.println("O/A cliente " + client.getName() + " acabou de entrar na fila!");
        System.out.println("Número de atendimento " + client.getService_number());
    }
    public void Dequeue() {
        if (first == null) {
            System.out.println("The queue is empty!");
        } else {
            Client removedClient = first.getClient();
            System.out.println(" ");
            System.out.println("O cliente " + removedClient.getName() + " acabou de ser atendido!");
            System.out.println("Número de atendimento: " + removedClient.getService_number());
            first = first.next;
            if (first == null) {
                last = null;
            }
        }
    }
        public void Display(){
        Node temporary = first;
        System.out.println("Nomes dos clientes por ordem de chegada que ainda estão na fila: ");
        while(temporary!=null){
            Client client = temporary.getClient();
            System.out.print(client.getName());
            System.out.print("->");
            temporary=temporary.next;
        }
            System.out.print("null");
    }

    public void BeingServed(){
        if(first==null){
            System.out.println("Não há ninguém na fila!");

        }
        else {
            Client currentClient = first.getClient();
            System.out.println("O cliente " + currentClient.getName() + " está sendo atendido!");
        }
    }
    public void EmptyQueue(){
        if(first==null){
            System.out.println("A fila está vazia!!!");
        }
        else {
            System.out.println("Há clientes na fila!");
        }
    }
}
