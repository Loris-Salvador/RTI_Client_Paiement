import controller.MainWindowController;
import view.window.WindowClient;

public class Main {
    public static void main(String[] args) {
        WindowClient mainWindow = new WindowClient();
        MainWindowController mainWindowController = new MainWindowController(mainWindow);
        mainWindow.setController(mainWindowController);


    }
}