package abstract_factory;

public class ImageDocument implements Document{
    @Override
    public void open() {
        System.out.println("Image is opened!");
    }

    @Override
    public void save() {
        System.out.println("Image is saved!");
    }
}
