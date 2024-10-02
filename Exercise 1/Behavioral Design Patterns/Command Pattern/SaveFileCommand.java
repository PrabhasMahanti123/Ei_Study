public class SaveFileCommand implements Command {
    private FileSystemReceiver fileSystem;

    public SaveFileCommand(FileSystemReceiver fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public void execute() {
        fileSystem.saveFile();
    }
}
