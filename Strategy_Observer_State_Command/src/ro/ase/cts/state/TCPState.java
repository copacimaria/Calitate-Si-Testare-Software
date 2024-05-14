package ro.ase.cts.state;

public interface TCPState {
     void open(TCPConnection connection);
     void close(TCPConnection connection);
     void acknowledge(TCPConnection connection);
}
