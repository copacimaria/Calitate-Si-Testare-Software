package abstract_factory;

public class Main_abstract {
    public static void main(String[] args) {
        DocumentFactory TextDocumentFactory= new TextDocumentFactory();
        Document textDocument=TextDocumentFactory.createDocument();
        textDocument.open();
        textDocument.save();
        DocumentFactory ImageDocumentFactory= new ImageDocumentFactory();
        Document imageDocument=ImageDocumentFactory.createDocument();
        imageDocument.open();
        imageDocument.save();
}
}
