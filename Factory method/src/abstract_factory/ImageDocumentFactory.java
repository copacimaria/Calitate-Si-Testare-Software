package abstract_factory;

public class ImageDocumentFactory implements DocumentFactory{
    @Override
    public Document createDocument() {
        return  new ImageDocument();
    }
}
