public class DocumentFactory {
    public static Document createDocument(String type) {
        switch (type) {
            case "PDF":
                return new PDFDocument();
            case "Excel":
                return new ExcelDocument();
            case "Word":
                return new WordDocument();
            default:
                throw new IllegalArgumentException("Unknown document type.");
        }
    }
}
