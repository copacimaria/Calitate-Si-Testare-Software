package ro.ase.cts.state;

public class Main {
    public static void main(String[] args){
        TCPConnection connection= new TCPConnection();

        connection.open();
        connection.acknowledge();
        connection.close();
    }
}
