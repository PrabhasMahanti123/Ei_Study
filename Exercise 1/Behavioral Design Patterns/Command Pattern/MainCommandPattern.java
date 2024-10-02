public class MainCommandPattern {
    public static void main(String[] args) {
        FileSystemReceiver fileSystem = new FileSystemReceiver();

        Command openFileCommand = new OpenFileCommand(fileSystem);
        Command saveFileCommand = new SaveFileCommand(fileSystem);

        FileInvoker fileInvoker = new FileInvoker(openFileCommand);
        fileInvoker.executeCommand();

        fileInvoker = new FileInvoker(saveFileCommand);
        fileInvoker.executeCommand();
    }
}
