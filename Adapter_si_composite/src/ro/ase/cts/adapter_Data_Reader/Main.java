package ro.ase.cts.adapter_Data_Reader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DataReader xmlAdapter= new XMLAdapter(new XMLDataReader());
        DataReader jsonAdapter= new JSONAdapter(new JSONDataReader());
        System.out.println(xmlAdapter.readData());
        System.out.println(jsonAdapter.readData());
        //nu aveti acces la codul sursa la produsul extern
    }
}