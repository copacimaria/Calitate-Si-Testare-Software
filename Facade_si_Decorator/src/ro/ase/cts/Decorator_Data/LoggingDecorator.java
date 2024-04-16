package ro.ase.cts.Decorator_Data;

public class LoggingDecorator implements DataService{
    private DataService wrappee;

    LoggingDecorator(DataService wrappee){
        this.wrappee=wrappee;
    }

    public String fetchData(){
        System.out.println("Fetching data...");
        return wrappee.fetchData();
    }
}
