public class MainFactoryMethod {
    public static void main(String[] args) {
        Document doc1 = DocumentFactory.createDocument("PDF");
        doc1.generate();

        Document doc2 = DocumentFactory.createDocument("Excel");
        doc2.generate();
    }
}
