public class MainCompositePattern {
    public static void main(String[] args) {
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");

        Directory dir = new Directory("Documents");
        dir.add(file1);
        dir.add(file2);

        dir.showDetails();
    }
}
