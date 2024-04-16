package ro.ase.cts.Facade_home_theatre;

public class Projector {
    void on() {
        System.out.println("Projector is on");
    }

    void off() {
        System.out.println("Projector is off");
    }

    void setInput(DvdPlayer dvd) {
        System.out.println("Setting input to DVD player");
    }

    void wideScreenMode() {
        System.out.println("Setting wide screen mode on projector");
    }
}
