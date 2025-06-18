public class Client {
    private String name;
    private int Service_number;

    public Client(String name, int service_number) {
        this.name = name;
        Service_number = service_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getService_number() {
        return Service_number;
    }

    public void setService_number(int service_number) {
        Service_number = service_number;
    }
}
