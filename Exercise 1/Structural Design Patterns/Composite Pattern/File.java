public class File extends FileComponent {
    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void showDetails() {
        System.out.println(fileName);
    }
}
