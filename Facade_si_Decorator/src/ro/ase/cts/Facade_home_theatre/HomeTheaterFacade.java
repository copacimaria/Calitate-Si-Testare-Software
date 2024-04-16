package ro.ase.cts.Facade_home_theatre;

public class HomeTheaterFacade {
    private Amplifier amp;
    private DvdPlayer dvd;
    private Projector projector;
    private TheaterLights lights;

    HomeTheaterFacade(Amplifier amp, DvdPlayer dvd, Projector projector, TheaterLights lights){
        this.amp= amp;
        this.dvd=dvd;
        this.projector=projector;
        this.lights=lights;
    }

    void watchMovie(String movie){
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        projector.on();
        projector.setInput(dvd);
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    void endMovie(){
        System.out.println("Shutting movie theater down...");
        lights.on();
        amp.off();
        projector.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}
