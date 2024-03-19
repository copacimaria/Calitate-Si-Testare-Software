package abstract_factory;

import factory_method_second_example.Animal;
import factory_method_second_example.Cat;

public class TextDocumentFactory implements DocumentFactory{
    @Override
    public Document createDocument() {
        return new TextDocument();
    }

}
