public class FileInvoker {
    private Command command;

    public FileInvoker(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
