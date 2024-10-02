import java.util.ArrayList;
import java.util.List;

public class Directory extends FileComponent {
    private List<FileComponent> files = new ArrayList<>();
    private String dirName;

    public Directory(String dirName) {
        this.dirName = dirName;
    }

    public void add(FileComponent file) {
        files.add(file);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory: " + dirName);
        for (FileComponent file : files) {
            file.showDetails();
        }
    }
}
