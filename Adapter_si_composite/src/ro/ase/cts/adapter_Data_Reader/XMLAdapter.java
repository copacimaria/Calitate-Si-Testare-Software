package ro.ase.cts.adapter_Data_Reader;

public class XMLAdapter implements DataReader{
    private XMLDataReader xmlReader;
    public XMLAdapter(XMLDataReader xmlReader){
        this.xmlReader=xmlReader;
    }
    @Override
    public String readData(){
        return xmlReader.readXML();
    }
}
