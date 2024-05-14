package ro.ase.cts.observer;

public interface Subject {
    void regsisterObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
