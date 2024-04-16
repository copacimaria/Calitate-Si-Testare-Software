package ro.ase.cts.Facade_home_theatre;

public class DvdPlayer {
    void on() {
        System.out.println("DVD player is on");
    }

    void off() {
        System.out.println("DVD player is off");
    }

    void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    void stop() {
        System.out.println("Stopping DVD player");
    }

    void eject() {
        System.out.println("Ejecting DVD");
    }
}
