package ro.ase.cts.Decorator_Data;

public class Main_ex1 {
    public static void main(String[] args) {//atunci cand avem nevoie de o functionalitate extra fata de ce avem deja pt o clasa
        DataService myDataService = new LoggingDecorator(new DataServiceConcrete());
        System.out.println(myDataService.fetchData());

        //create the actual data service obj;
        DataService realDataService= new DataServiceConcrete();

        //decorate the real data service with logging decorator
        DataService loggedDataService = new LoggingDecorator(realDataService);

        //use the decorated service to fetch data
        String data = loggedDataService.fetchData();
        System.out.println("Data Retrieved: "+data);


    }
}