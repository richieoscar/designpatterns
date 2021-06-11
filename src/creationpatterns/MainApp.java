package creationpatterns;

public class MainApp {
    static Dialog mDialog;

    public static void main(String[] args) {
        configure();
        runLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) mDialog = new WindowsDialog();
        else mDialog = new HtmlDialog();
    }

    static void runLogic() {
        mDialog.renderWindow();
    }
}
