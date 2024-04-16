package ro.ase.cts.Facade_home_theatre;

public class Amplifier {
    void on() {
        System.out.println("Amplifier is on");
    }

    void off() {
        System.out.println("Amplifier is off");
    }

    void setDvd(DvdPlayer dvd) {
        System.out.println("Setting DVD player to amplifier");
    }

    void setSurroundSound() {
        System.out.println("Setting surround sound on amplifier");
    }

    void setVolume(int volume) {
        System.out.println("Setting volume to " + volume + " on amplifier");
    }
}
