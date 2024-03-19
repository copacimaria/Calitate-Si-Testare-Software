package abstract_factory;

public class TextDocument implements Document{
    @Override
    public void open() {
        System.out.println("File is open!");
    }

    @Override
    public void save() {
        System.out.println("File is saved!");
    }
}
